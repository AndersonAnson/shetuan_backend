package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.OtherHistoricalDataIndex;
import com.shetuan.service.OtherHistoricalDataIndexService;
@Service("OtherHistoricalDataIndexServiceImpl")
public class OtherHistoricalDataIndexServiceImpl extends BaseServiceImpl<OtherHistoricalDataIndex,Long> implements OtherHistoricalDataIndexService{
	@Override
	@Resource(name="OtherHistoricalDataIndexDaoImpl")
	public void setBaseDao(BaseDao<OtherHistoricalDataIndex,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}

