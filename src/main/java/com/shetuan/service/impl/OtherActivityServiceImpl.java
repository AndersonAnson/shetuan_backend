package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.OtherActivity;
import com.shetuan.service.OtherActivityService;
@Service("OtherActivityServiceImpl")
public class OtherActivityServiceImpl extends BaseServiceImpl<OtherActivity,Long> implements OtherActivityService{
	@Override
	@Resource(name="OtherActivityDaoImpl")
	public void setBaseDao(BaseDao<OtherActivity,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}
