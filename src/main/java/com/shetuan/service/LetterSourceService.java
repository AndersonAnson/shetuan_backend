package com.shetuan.service;

import com.shetuan.service.BaseService;
import com.shetuan.model.Json;
import com.shetuan.entity.LetterSource;

public interface LetterSourceService extends BaseService<LetterSource,Long> {
	
	public Json addLetterSource(String sourceType,Long letterID, String name, String url);
}
