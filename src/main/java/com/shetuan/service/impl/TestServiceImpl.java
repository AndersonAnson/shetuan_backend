package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.shetuan.service.TestService;
import com.shetuan.dao.BaseDao;
import com.shetuan.entity.Test;
@Service("TestServiceImpl")
public class TestServiceImpl extends BaseServiceImpl<Test,Long> implements TestService{
	@Override
	@Resource(name="TestDaoImpl")
	public void setBaseDao(BaseDao<Test,Long> baseDao) {
		super.setBaseDao(baseDao);
	}

}
