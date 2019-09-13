package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.RealObjectImageDao;
import com.shetuan.entity.RealObjectImage;

@Repository("RealObjectImageDaoImpl")
public class RealObjectImageDaoImpl extends BaseDaoImpl<RealObjectImage,Long> implements RealObjectImageDao{
	
}