package com.zr.crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.ProjectinfoMapper;
import com.zr.crm.model.Projectinfo;
import com.zr.crm.model.ProjectinfoExample;

@Service
public class ProjectinfoServiceImpl implements ProjectinfoService {

	@Autowired
	private ProjectinfoMapper projectinfoMapper;

	@Override
	public void saveProjectinfo(Projectinfo projectinfo) {
		projectinfoMapper.insert(projectinfo);
	}

	@Override
	public void updateProjectinfo(Projectinfo projectinfo) {
		projectinfoMapper.updateByPrimaryKey(projectinfo);
	}

	@Override
	public void deleteProjectinfo(String priNo) {
		projectinfoMapper.deleteByPrimaryKey(priNo);
	}

	@Override
	public List<Projectinfo> findById(String id) {
		ProjectinfoExample example = new ProjectinfoExample();
		List<Projectinfo> list = projectinfoMapper.selectByExample(example);
		List<Projectinfo> listByNo = new ArrayList<Projectinfo>();
		for(Projectinfo projectinfo:list){
			String priNo = projectinfo.getPriNo();
			if(id.equals(priNo)){
				listByNo.add(projectinfo);
			}
		}
		return listByNo;
	}

	@Override
	public List<Projectinfo> findProjectinfoList() {
		ProjectinfoExample example = new ProjectinfoExample();	
		return projectinfoMapper.selectByExample(example);
	}

	@Override
	public Projectinfo findbyId(String priNo) {
		Projectinfo projectinfo = projectinfoMapper.selectByPrimaryKey(priNo);
		return projectinfo;
	}

	

}
