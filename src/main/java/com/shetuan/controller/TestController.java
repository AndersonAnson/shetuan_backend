package com.shetuan.controller;

import com.shetuan.entity.Test;
import com.shetuan.model.Json;
import com.shetuan.service.TestService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@Resource(name = "TestServiceImpl")
	TestService testService;

	@RequestMapping("/getAll")
	@ResponseBody //解决不返回json而是返回jsp视图问题
	public Json getAll(){
		Json j=new Json();
		List<Test> list=testService.findAll();
		
		j.setSuccess(true);
		j.setMsg("获取成功");
		j.setObj(list);
		return j;
    }
}
