package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.IndustrialActivityDao;
import com.shetuan.entity.IndustrialActivity;

@Repository("IndustrialActivityDaoImpl")
public class IndustrialActivityDaoImpl extends BaseDaoImpl<IndustrialActivity,Long> implements IndustrialActivityDao{
	
}