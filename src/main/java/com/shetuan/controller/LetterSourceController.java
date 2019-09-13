package com.shetuan.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shetuan.model.Json;
import com.shetuan.service.LetterService;
import com.shetuan.service.LetterSourceService;

@RestController
@RequestMapping("/admin/letter")
public class LetterSourceController {


	@Resource(name = "letterSourceServiceImpl")
	private LetterSourceService letterSourceService;

	@RequestMapping(value="add")
	@ResponseBody
	public Json addLetterSource(String type, Long letterID, String name, String url){
		Json json = new Json();
		try {
			json = letterSourceService.addLetterSource(type, letterID,  name,  url);	
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("添加失败: "+e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return json;		
	}
}

