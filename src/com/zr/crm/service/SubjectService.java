package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.List;

import com.zr.crm.model.Subject;

public interface SubjectService
{
	public void saveSubject(Subject Subject);
	
	public void updateSubject(Subject Subject);
	
	public void deleteSubject(BigDecimal id);
	
	public List<Subject> findByName(String name);
	
	public List<Subject> findSubjectList();
	
	public Subject findbyId(BigDecimal stuId);
}
