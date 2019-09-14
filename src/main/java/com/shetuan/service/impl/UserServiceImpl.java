package com.shetuan.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.entity.Permission;
import com.shetuan.entity.Role;
import com.shetuan.entity.User;
import com.shetuan.model.Filter;
import com.shetuan.service.UserService;
@Service("UserServiceImpl")
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService{
	@Override
	@Resource(name="UserDaoImpl")
	public void setBaseDao(BaseDao<User,Long> baseDao) {
		super.setBaseDao(baseDao);
	}

	@Override
	public Set<String> getRoleByUserName(String username) {
		List<Filter> filter=new ArrayList<Filter>();
		filter.add(Filter.eq("username", username));
		List<User> roleList=this.findList(null, filter, null);
		User u=roleList.get(0);
		Set<String> roleSet=new HashSet<>();
		for(Role r:u.getRoles()) {
			roleSet.add(r.getRoleName());
		}
		return roleSet;
	}

	@Override
	public Set<String> getPermissionByUserName(String username) {
		List<Filter> filter=new ArrayList<Filter>();
		filter.add(Filter.eq("username", username));
		List<User> roleList=this.findList(null, filter, null);
		User u=roleList.get(0);
		Set<String> permissionNameSet = new HashSet<>();
		for(Role r:u.getRoles()) {			
			for(Permission p:r.getPermissions()) {
				permissionNameSet.add(p.getPermissionName());
			}
		}
		return permissionNameSet;
	}

	@Override
	public User findByUserName(String username) {
		List<Filter> filter=new ArrayList<Filter>();
		filter.add(Filter.eq("username", username));
		List<User> roleList=this.findList(null, filter, null);
		User u=roleList.get(0);
		return u;
	}
}
