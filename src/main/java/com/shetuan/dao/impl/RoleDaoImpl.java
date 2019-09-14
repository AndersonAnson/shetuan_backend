package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.RoleDao;
import com.shetuan.entity.Role;

@Repository("RoleDaoImpl")
public class RoleDaoImpl extends BaseDaoImpl<Role,Long> implements RoleDao{

}
