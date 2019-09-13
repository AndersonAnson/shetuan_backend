package com.shetuan.service;

import com.shetuan.service.BaseService;
import com.shetuan.model.Json;
import com.shetuan.model.Pageable;
import com.shetuan.entity.Organization;

public interface OrganizationService extends BaseService<Organization,Long>{
	public Json listView(Pageable pageable,String name);
}
