package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.IndustrialActivity;
import com.shetuan.service.IndustrialActivityService;
@Service("IndustrialActivityServiceImpl")
public class IndustrialActivityServiceImpl extends BaseServiceImpl<IndustrialActivity,Long> implements IndustrialActivityService{
	@Override
	@Resource(name="IndustrialActivityDaoImpl")
	public void setBaseDao(BaseDao<IndustrialActivity,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}
