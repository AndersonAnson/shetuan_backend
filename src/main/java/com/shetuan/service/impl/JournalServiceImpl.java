package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.entity.Journal;
import com.shetuan.service.JournalService;
@Service("JournalServiceImpl")
public class JournalServiceImpl extends BaseServiceImpl<Journal,Long> implements JournalService{
	@Override
	@Resource(name="JournalDaoImpl")
	public void setBaseDao(BaseDao<Journal,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
}

