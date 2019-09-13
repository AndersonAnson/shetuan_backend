package com.shetuan.service;

import com.shetuan.service.BaseService;
import com.shetuan.model.Json;
import com.shetuan.entity.RealObjectSource;

public interface RealObjectSourceService extends BaseService<RealObjectSource,Long> {
	
	public Json addRealObjectSource(String sourceType,Long realObjectID, String name, String url);
}