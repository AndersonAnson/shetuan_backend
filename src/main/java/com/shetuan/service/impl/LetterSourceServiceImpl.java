package com.shetuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.model.Json;
import com.shetuan.dao.LetterSourceDao;
import com.shetuan.entity.Letter;
import com.shetuan.entity.LetterAudio;
import com.shetuan.entity.LetterImage;
import com.shetuan.entity.LetterSource;
import com.shetuan.entity.LetterVideo;
import com.shetuan.service.LetterService;
import com.shetuan.service.LetterSourceService;

/**
 * @author cxy
 * Sep 9, 2019
 */
@Service("letterSourceServiceImpl")
public class LetterSourceServiceImpl extends BaseServiceImpl<LetterSource, Long> implements LetterSourceService {
	
	@Resource(name = "LetterSourceDaoImpl")
	private LetterSourceDao letterSourceDao;

	@Resource(name = "letterServiceImpl")
	private LetterService letterService;
	
	@Resource(name = "LetterSourceDaoImpl")
	public void setBaseDao(BaseDao<LetterSource,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
	
	public Json addLetterSource(String sourceType, Long letterID, String name, String url){
		Json json = new Json();
		
		LetterSource letterSource = new LetterAudio();
		if("image".equals(sourceType))
			letterSource = new LetterImage();
		else if("video".equals(sourceType))
			letterSource = new LetterVideo();
		
		Letter letter = letterService.find(letterID);
		letterSource.setLetter(letter);
		System.out.println(letter.getName());
		letterSource.setName(name);
		letterSource.setUrl(url);
		this.save(letterSource);
		json.setSuccess(true);
		json.setMsg("添加成功");
		json.setObj(letterSource);
		return json;		
	}
}
