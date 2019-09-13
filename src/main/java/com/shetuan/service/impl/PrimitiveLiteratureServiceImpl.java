package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.PrimitiveLiterature;
import com.shetuan.service.PrimitiveLiteratureService;
@Service("PrimitiveLiteratureServiceImpl")
public class PrimitiveLiteratureServiceImpl extends BaseServiceImpl<PrimitiveLiterature,Long> implements PrimitiveLiteratureService{
	@Override
	@Resource(name="PrimitiveLiteratureDaoImpl")
	public void setBaseDao(BaseDao<PrimitiveLiterature,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}

