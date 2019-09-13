package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.HistoricalDataIndex;
import com.shetuan.service.HistoricalDataIndexService;
@Service("HistoricalDataIndexServiceImpl")
public class HistoricalDataIndexServiceImpl extends BaseServiceImpl<HistoricalDataIndex,Long> implements HistoricalDataIndexService{
	@Override
	@Resource(name="HistoricalDataIndexDaoImpl")
	public void setBaseDao(BaseDao<HistoricalDataIndex,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}

