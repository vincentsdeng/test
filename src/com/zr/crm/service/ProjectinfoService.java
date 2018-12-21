package com.zr.crm.service;

import java.util.List;

import com.zr.crm.model.Projectinfo;

public interface ProjectinfoService {

	public void saveProjectinfo(Projectinfo projectinfo);

	public void updateProjectinfo(Projectinfo projectinfo);

	public void deleteProjectinfo(String id);

	public List<Projectinfo> findById(String id);

	public List<Projectinfo> findProjectinfoList();
	
	public Projectinfo findbyId(String priNo);

}
