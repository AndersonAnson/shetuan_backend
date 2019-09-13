package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.LetterDao;
import com.shetuan.entity.Letter;

@Repository("LetterDaoImpl")
public class LetterDaoImpl extends BaseDaoImpl<Letter,Long> implements LetterDao{
	
}