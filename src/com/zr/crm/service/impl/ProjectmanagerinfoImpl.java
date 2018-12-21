package com.zr.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.ProjectmanagerinfoMapper;
import com.zr.crm.model.Projectmanagerinfo;
import com.zr.crm.service.IProjectmanagerinfoService;

@Service
public class ProjectmanagerinfoImpl implements IProjectmanagerinfoService{
	
	@Autowired
	private ProjectmanagerinfoMapper pMapper;
	
	@Override
	public void save(Projectmanagerinfo pi) {
		int result=pMapper.insert(pi);
		System.out.println(result);
	}

	@Override
	public void update(Projectmanagerinfo pi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Projectmanagerinfo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Projectmanagerinfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
