package com.shetuan.dao;

import com.shetuan.entity.User;

import java.util.List;

import com.shetuan.entity.Role;

public interface UserDao extends BaseDao<User,Long>{
	public List<Role> findRoleNameByUsername(String username);
}
