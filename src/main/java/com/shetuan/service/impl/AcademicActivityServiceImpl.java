package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.AcademicActivity;
import com.shetuan.service.AcademicActivityService;
@Service("AcademicActivityServiceImpl")
public class AcademicActivityServiceImpl extends BaseServiceImpl<AcademicActivity,Long> implements AcademicActivityService{
	@Override
	@Resource(name="AcademicActivityDaoImpl")
	public void setBaseDao(BaseDao<AcademicActivity,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}
