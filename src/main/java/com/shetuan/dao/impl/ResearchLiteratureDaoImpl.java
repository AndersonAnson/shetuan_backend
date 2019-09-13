package com.shetuan.dao.impl;
import org.springframework.stereotype.Repository;
import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.entity.ResearchLiterature;
import com.shetuan.dao.ResearchLiteratureDao;
@Repository("ResearchLiteratureDaoImpl")
public class ResearchLiteratureDaoImpl extends BaseDaoImpl<ResearchLiterature,Long> implements ResearchLiteratureDao{

}
