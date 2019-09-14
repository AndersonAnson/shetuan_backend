package com.shetuan.service;

import java.util.List;
import java.util.Set;

import com.shetuan.entity.Role;
import com.shetuan.entity.User;

public interface UserService extends BaseService<User,Long>{
	public Set<String> getRoleByUserName(String username);
	public Set<String> getPermissionByUserName(String username);
	public User findByUserName(String username);
}
