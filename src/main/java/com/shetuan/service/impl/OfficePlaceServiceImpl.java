package com.shetuan.service.impl;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.model.Filter;
import com.shetuan.dao.OfficePlaceDao;
import com.shetuan.entity.OfficePlace;
import com.shetuan.service.OfficePlaceService;
@Service("OfficePlaceServiceImpl")
public class OfficePlaceServiceImpl extends BaseServiceImpl<OfficePlace,Long> implements OfficePlaceService{
	@Override
	@Resource(name="OfficePlaceDaoImpl")
	public void setBaseDao(BaseDao<OfficePlace,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}
