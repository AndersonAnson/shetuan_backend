package com.shetuan.dao.impl;
import org.springframework.stereotype.Repository;
import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.entity.OtherActivity;
import com.shetuan.dao.OtherActivityDao;
@Repository("OtherActivityDaoImpl")
public class OtherActivityDaoImpl extends BaseDaoImpl<OtherActivity,Long> implements OtherActivityDao{

}
