package com.shetuan.shiro;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.shetuan.entity.User;
import com.shetuan.service.UserService;

public class CustomRealm extends AuthorizingRealm{
	@Resource
	UserService userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		String username=principals.getPrimaryPrincipal().toString();
		Set<String> roleNameSet=userService.getRoleByUserName(username);
		Set<String> permissionNameSet=userService.getPermissionByUserName(username);
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.setRoles(roleNameSet);
		simpleAuthorizationInfo.setStringPermissions(permissionNameSet);
		return simpleAuthorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken upToken=(UsernamePasswordToken)token;
		String username=upToken.getUsername();
		User u=userService.findByUserName(username);
		if(u==null) {
			throw new UnknownAccountException();
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                u.getUsername(), //用户名
                u.getPassword(), //密码
                getName()  //realm name
        );
		return authenticationInfo;
	}

}
