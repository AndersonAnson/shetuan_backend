package com.shetuan.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shetuan.dao.BaseDao;
import com.shetuan.service.impl.BaseServiceImpl;
import com.shetuan.model.Filter;
import com.shetuan.model.Json;
import com.shetuan.model.Page;
import com.shetuan.model.Pageable;
import com.shetuan.dao.OrganizationDao;
import com.shetuan.entity.Organization;
import com.shetuan.service.OfficePlaceService;
import com.shetuan.service.OrganizationService;
@Service("OrganizationServiceImpl")
public class OrganizationServiceImpl extends BaseServiceImpl<Organization,Long> implements OrganizationService{
	@Resource(name="OrganizationDaoImpl")
	OrganizationDao OrganizationDao;

	@Override
	@Resource(name="OrganizationDaoImpl")
	public void setBaseDao(BaseDao<Organization,Long> baseDao) {
		super.setBaseDao(baseDao);
	}
	public Json listView(Pageable pageable,String name) {
		Json j=new Json();
		try {
			HashMap<String,Object> hm=new HashMap<String,Object>();
			List<HashMap<String, Object>> result = new ArrayList<>();
			/** 筛选 */
			List<Filter> filters = new ArrayList<Filter>();
			if(name!=null) {
				filters.add(Filter.like("name", name));
			}
			pageable.setFilters(filters);
			Page<Organization> page=OrganizationDao.findPage(pageable);
			for(Organization tmp:page.getRows()) {
				HashMap<String,Object> m=new HashMap<String,Object>();
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
				result.add(m);
			}
			hm.put("total",page.getTotal());
			hm.put("pageNumber",page.getPageNumber());
			hm.put("pageSize",page.getPageSize());
			hm.put("rows",result);
			j.setSuccess(true);
			j.setMsg("获取成功");
			j.setObj(hm);
		} 
		catch (Exception e) {
			j.setSuccess(false);
			j.setMsg("获取失败: "+e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return j;
	}
}
