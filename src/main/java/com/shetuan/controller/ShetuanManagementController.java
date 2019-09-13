package com.shetuan.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shetuan.model.Filter;
import com.shetuan.model.Json;
import com.shetuan.model.Pageable;
import com.shetuan.entity.Organization;
import com.shetuan.service.OrganizationService;

@RestController
@RequestMapping("/admin/shetuanManagement/")
public class ShetuanManagementController {
	@Resource(name = "OrganizationServiceImpl")
	OrganizationService organizationService;
	
	@RequestMapping(value="list")
	@ResponseBody
	public Json list(Pageable pageable,String name) {
		Json j=new Json();
		j=organizationService.listView(pageable, name);
		return j;
	}
	
	@RequestMapping(value="getDetail")
	@ResponseBody
	public Json getDetail(Long organizationID) {
		Json j=new Json();
		try {
			HashMap<String,Object> m=new HashMap<String,Object>();
			Organization tmp=organizationService.find(organizationID);	
			m.put("id", tmp.getId());
			m.put("name",tmp.getName());
			m.put("nameHistory",tmp.getNameHistory());
			m.put("createTime",tmp.getCreateTime());
			m.put("ctType",tmp.getCtType());
			m.put("deleteTime",tmp.getDeleteTime());
			m.put("dtType",tmp.getDtType());
			m.put("place",tmp.getPlace());
			m.put("creator",tmp.getCreator());
			m.put("leader",tmp.getLeader());
			m.put("secretariat",tmp.getSecretariat());
			m.put("member",tmp.getMember());
			m.put("cTime",tmp.getCtime());
			m.put("cName",tmp.getCname());
			m.put("mTime",tmp.getMtime());
			m.put("mName",tmp.getMname());
			m.put("state",tmp.getState());
			m.put("remark",tmp.getRemark());
			m.put("officePlace", tmp.getOfficePlaces());
			m.put("academicActivity", tmp.getAcademicActivity());
			m.put("scienceActivity", tmp.getScienceActivity());
			m.put("industrialActivity", tmp.getIndustrialActivity());
			m.put("otherActivity", tmp.getOtherActivity());
			m.put("journal", tmp.getJournal());
			m.put("primitiveLiterature", tmp.getPrimitiveLiterature());
			m.put("researchLiterature", tmp.getResearchLiterature());
			m.put("realObject", tmp.getRealObject());
			m.put("letter", tmp.getLetter());
			m.put("constitution", tmp.getConstitution());
			m.put("historicalDataIndex", tmp.getHistoricalDataIndex());
			m.put("otherHistoricalDataIndex", tmp.getOtherHistoricalDataIndex());
			j.setSuccess(true);
			j.setMsg("获取成功");
			j.setObj(m);
		} catch (Exception e) {
			j.setSuccess(false);
			j.setMsg("获取失败");
			e.printStackTrace();
			// TODO: handle exception
		}
		return j;
	}
}
