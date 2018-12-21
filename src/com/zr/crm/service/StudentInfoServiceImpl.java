package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.StudentinfoMapper;
import com.zr.crm.model.Studentinfo;
import com.zr.crm.model.StudentinfoExample;

@Service
public class StudentInfoServiceImpl implements StudentInfoService
{
	@Autowired
	private StudentinfoMapper studentinfoMapper;

	@Override
	public void saveStudentinfo(Studentinfo studentinfo)
	{
		studentinfoMapper.insert(studentinfo);
	}

	@Override
	public void updateStudentinfo(Studentinfo studentinfo)
	{
		studentinfoMapper.updateByPrimaryKey(studentinfo);
	}

	@Override
	public void deleteStudentinfo(BigDecimal id)
	{
		studentinfoMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<Studentinfo> findByName(String name)
	{
		StudentinfoExample studentinfoExample=new StudentinfoExample();
		List<Studentinfo> list=studentinfoMapper.selectByExample(studentinfoExample);
		List<Studentinfo> listByName=new ArrayList<Studentinfo>();
		for(Studentinfo studentinfo:list){
			String stuName=studentinfo.getStuName();
			if(name.equals(stuName)){
				listByName.add(studentinfo);
			}
		}
		return listByName;
	}
	
	@Override
	public List<Studentinfo> findStudentinfoList()
	{
		
		StudentinfoExample studentinfoExample=new StudentinfoExample();
		return studentinfoMapper.selectByExample(studentinfoExample);
	}

	@Override
	public Studentinfo findbyId(BigDecimal stuId) {
		Studentinfo studentinfo=studentinfoMapper.selectByPrimaryKey(stuId);
		return studentinfo;
	}
}
