package com.shetuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.dao.OrganizationAudioDao;
import com.shetuan.entity.OrganizationAudio;
@Repository("OrganizationAudioDaoImpl")
public class OrganizationAudioDaoImpl extends BaseDaoImpl<OrganizationAudio,Long> implements OrganizationAudioDao{

}
