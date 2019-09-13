package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.ResearchLiterature;
import com.shetuan.service.ResearchLiteratureService;
@Service("ResearchLiteratureServiceImpl")
public class ResearchLiteratureServiceImpl extends BaseServiceImpl<ResearchLiterature,Long> implements ResearchLiteratureService{
	@Override
	@Resource(name="ResearchLiteratureDaoImpl")
	public void setBaseDao(BaseDao<ResearchLiterature,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}

