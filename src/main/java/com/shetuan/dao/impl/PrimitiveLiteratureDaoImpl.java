package com.shetuan.dao.impl;
import org.springframework.stereotype.Repository;
import com.shetuan.dao.impl.BaseDaoImpl;
import com.shetuan.entity.PrimitiveLiterature;
import com.shetuan.dao.PrimitiveLiteratureDao;
@Repository("PrimitiveLiteratureDaoImpl")
public class PrimitiveLiteratureDaoImpl extends BaseDaoImpl<PrimitiveLiterature,Long> implements PrimitiveLiteratureDao{

}
