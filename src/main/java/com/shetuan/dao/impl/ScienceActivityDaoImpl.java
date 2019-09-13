package com.shetuan.dao.impl;
import org.springframework.stereotype.Repository;
import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.entity.ScienceActivity;
import com.shetuan.dao.ScienceActivityDao;
@Repository("ScienceActivityDaoImpl")
public class ScienceActivityDaoImpl extends BaseDaoImpl<ScienceActivity,Long> implements ScienceActivityDao{

}