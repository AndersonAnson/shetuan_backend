package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.Constitution;
import com.shetuan.service.ConstitutionService;
@Service("ConstitutionServiceImpl")
public class ConstitutionServiceImpl extends BaseServiceImpl<Constitution,Long> implements ConstitutionService{
	@Override
	@Resource(name="ConstitutionDaoImpl")
	public void setBaseDao(BaseDao<Constitution,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}
