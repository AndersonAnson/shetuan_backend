package com.shetuan.controller;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shetuan.model.Json;
import com.shetuan.service.UserService;

@Controller
public class AuthController {
	@Resource
	UserService	userService;
	
	@RequestMapping(value="/notLogin",method=RequestMethod.GET)
	@ResponseBody
	public Json notLogin() {
		Json j=new Json();
		j.setSuccess(true);
    	j.setMsg("您尚未登陆");
    	j.setObj("您尚未登陆");
		return j;
	}
	@RequestMapping(value="/login/unauthorized",method=RequestMethod.GET)
	@ResponseBody
	public Json notRole() {
		Json j=new Json();
		j.setSuccess(true);
    	j.setMsg("您没有权限");
    	j.setObj("您没有权限");
		return j;
	}
	
	@RequestMapping("/login")
	@ResponseBody
    public Json login(String username, String password){
        Json j=new Json();
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        subject.login(token);
        Set<String> roleSet=userService.getRoleByUserName(username);
        if(roleSet.contains("admin")) {
        	j.setSuccess(true);
        	j.setMsg("登录成功");
        	j.setObj("登录成功");
        }
        else if(roleSet.contains("user")) {
        	j.setSuccess(true);
        	j.setMsg("登录成功");
        	j.setObj("登录成功");
        }
        return j; 
    }
	
	/**
     * 退出登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/logout")
    @ResponseBody
    public Json logout(){
    	Json j=new Json();
        Subject subject = SecurityUtils.getSubject();
        // 当前用户是否为登录状态，已登录状态则登出
        if (subject.isAuthenticated()) {
            subject.logout();
        }
        j.setSuccess(true);
    	j.setMsg("logout");
    	j.setObj("logout");
    	return j;
    }
}
