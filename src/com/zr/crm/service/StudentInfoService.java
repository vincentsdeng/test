package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.List;

import com.zr.crm.model.Studentinfo;

public interface StudentInfoService
{
	public void saveStudentinfo(Studentinfo studentinfo);
	
	public void updateStudentinfo(Studentinfo studentinfo);
	
	public void deleteStudentinfo(BigDecimal id);
	
	public List<Studentinfo> findByName(String name);
	
	public List<Studentinfo> findStudentinfoList();

	public Studentinfo findbyId(BigDecimal stuId);
}
