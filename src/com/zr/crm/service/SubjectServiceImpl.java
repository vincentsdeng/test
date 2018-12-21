package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.SubjectMapper;
import com.zr.crm.model.Subject;
import com.zr.crm.model.SubjectExample;



@Service
public class SubjectServiceImpl implements SubjectService
{
	@Autowired
	private SubjectMapper subjectMapper;

	@Override
	public void saveSubject(Subject subject)
	{
		subjectMapper.insert(subject);
	}

	@Override
	public void updateSubject(Subject subject)
	{
		subjectMapper.updateByPrimaryKey(subject);
	}

	@Override
	public void deleteSubject(BigDecimal id)
	{
		subjectMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<Subject> findByName(String name)
	{
		SubjectExample subjectExample=new SubjectExample();
		List<Subject> list=subjectMapper.selectByExample(subjectExample);
		List<Subject> listByName=new ArrayList<Subject>();
		for(Subject subject:list){
			String stuName=subject.getSubjectName();
			if(name.equals(stuName)){
				listByName.add(subject);
			}
		}
		return listByName;
	}
	
	@Override
	public List<Subject> findSubjectList()
	{
		
		SubjectExample subjectExample=new SubjectExample();
		return subjectMapper.selectByExample(subjectExample);
	}

	@Override
	public Subject findbyId(BigDecimal stuId) {
		Subject subject=subjectMapper.selectByPrimaryKey(stuId);
		return subject;
	}
	
}
