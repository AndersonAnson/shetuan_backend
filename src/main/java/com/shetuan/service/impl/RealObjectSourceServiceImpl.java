package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.model.Json;
import com.shetuan.dao.RealObjectSourceDao;
import com.shetuan.entity.RealObject;
import com.shetuan.entity.RealObjectAudio;
import com.shetuan.entity.RealObjectImage;
import com.shetuan.entity.RealObjectSource;
import com.shetuan.entity.RealObjectVideo;
import com.shetuan.service.RealObjectService;
import com.shetuan.service.RealObjectSourceService;

@Service("realObjectSourceServiceImpl")
public class RealObjectSourceServiceImpl extends BaseServiceImpl<RealObjectSource, Long> implements RealObjectSourceService{

	@Resource(name = "realObjectSourceDaoImpl")
	private RealObjectSourceDao realObjectSourceDao;

	@Resource(name = "realObjectServiceImpl")
	private RealObjectService realObjectService;
	
	@Resource(name = "realObjectSourceDaoImpl")
	public void setBaseDao(BaseDao<RealObjectSource,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
	
	@Override
	public Json addRealObjectSource(String sourceType, Long realObjectID, String name, String url) {
		// TODO Auto-generated method stub
		Json json = new Json();
		
		RealObjectSource realObjectSource = new RealObjectAudio();
		if("image".equals(sourceType))
			realObjectSource = new RealObjectImage();
		else if("video".equals(sourceType))
			realObjectSource = new RealObjectVideo();
		
		RealObject realObject = realObjectService.find(realObjectID);
		realObjectSource.setRealObject(realObject);
		realObjectSource.setName(name);
		realObjectSource.setUrl(url);
		this.save(realObjectSource);
		json.setSuccess(true);
		json.setMsg("添加成功");
		json.setObj(realObjectSource);
		return json;		
	}

}
