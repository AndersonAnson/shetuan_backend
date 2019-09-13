package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.ScienceActivity;
import com.shetuan.service.ScienceActivityService;
@Service("ScienceActivityServiceImpl")
public class ScienceActivityServiceImpl extends BaseServiceImpl<ScienceActivity,Long> implements ScienceActivityService{
	@Override
	@Resource(name="ScienceActivityDaoImpl")
	public void setBaseDao(BaseDao<ScienceActivity,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}
