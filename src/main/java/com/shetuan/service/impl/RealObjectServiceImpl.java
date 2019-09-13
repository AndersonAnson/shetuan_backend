package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.RealObject;
import com.shetuan.service.RealObjectService;
@Service("realObjectServiceImpl")
public class RealObjectServiceImpl extends BaseServiceImpl<RealObject,Long> implements RealObjectService{
	@Override
	@Resource(name="realObjectDaoImpl")
	public void setBaseDao(BaseDao<RealObject,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}


