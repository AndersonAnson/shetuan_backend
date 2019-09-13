package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.TestDao;
import com.shetuan.entity.Test;

@Repository("TestDaoImpl")
public class TestDaoImpl extends BaseDaoImpl<Test,Long> implements TestDao{

}
