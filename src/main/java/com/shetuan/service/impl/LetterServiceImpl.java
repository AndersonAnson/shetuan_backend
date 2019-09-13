package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.Letter;
import com.shetuan.service.LetterService;
@Service("letterServiceImpl")
public class LetterServiceImpl extends BaseServiceImpl<Letter,Long> implements LetterService{
	@Override
	@Resource(name="LetterDaoImpl")
	public void setBaseDao(BaseDao<Letter,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}

