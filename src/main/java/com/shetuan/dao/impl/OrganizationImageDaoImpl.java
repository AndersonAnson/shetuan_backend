package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.OrganizationImageDao;
import com.shetuan.entity.OrganizationImage;
@Repository("OrganizationImageDaoImpl")
public class OrganizationImageDaoImpl extends BaseDaoImpl<OrganizationImage,Long> implements OrganizationImageDao{

}
