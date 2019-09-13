package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.LetterSourceDao;
import com.shetuan.entity.LetterSource;

@Repository("LetterSourceDaoImpl")
public class LetterSourceDaoImpl extends BaseDaoImpl<LetterSource,Long> implements LetterSourceDao{
	
}