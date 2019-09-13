package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.AcademicActivityDao;
import com.shetuan.entity.AcademicActivity;

@Repository("AcademicActivityDaoImpl")
public class AcademicActivityDaoImpl extends BaseDaoImpl<AcademicActivity,Long> implements AcademicActivityDao{
	
}