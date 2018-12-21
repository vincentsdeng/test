package com.zr.crm.service;

import java.util.List;

import com.zr.crm.model.Projectmanagerinfo;



public interface IProjectmanagerinfoService {
	void save(Projectmanagerinfo pi);
	void update(Projectmanagerinfo pi);
	void delete(int id);
	Projectmanagerinfo findById(int id);
	List<Projectmanagerinfo> findAll();
}
