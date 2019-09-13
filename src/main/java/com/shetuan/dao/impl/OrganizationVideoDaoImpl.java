package com.shetuan.dao.impl;
import org.springframework.stereotype.Repository;
import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.entity.OrganizationVideo;
import com.shetuan.dao.OrganizationVideoDao;
@Repository("OrganizationVideoDaoImpl")
public class OrganizationVideoDaoImpl extends BaseDaoImpl<OrganizationVideo,Long> implements OrganizationVideoDao{

}
