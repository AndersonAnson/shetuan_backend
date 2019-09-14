package com.shetuan.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.UserDao;
import com.shetuan.entity.Role;
import com.shetuan.entity.User;

@Repository("UserDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User,Long> implements UserDao{
	public List<Role> findRoleNameByUsername(String username) {
		return null;
	}
	
}
