package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.ExaminfoMapper;
import com.zr.crm.model.Examinfo;
import com.zr.crm.model.ExaminfoExample;
import com.zr.crm.model.Examinfo;
import com.zr.crm.model.ExaminfoExample;
import com.zr.crm.model.Studentinfo;

@Service
public class ExamInfoServiceImpl implements ExamInfoService
{
	@Autowired
	private ExaminfoMapper examinfoMapper;

	@Override
	public void insertExaminfo(Examinfo examinfo)
	{
		examinfoMapper.insert(examinfo);
	}

	@Override
	public void updateExaminfo(Examinfo examinfo) 
	{
		examinfoMapper.updateByPrimaryKey(examinfo);	
	}

	@Override
	public void deleteExaminfo(BigDecimal id) 
	{
		examinfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Examinfo> findByName(String name) 
	{	

		ExaminfoExample examinfoExample=new ExaminfoExample();
		List<Examinfo> list=examinfoMapper.selectByExample(examinfoExample);
		List<Examinfo> listByName=new ArrayList<Examinfo>();
		for(Examinfo examinfo:list){
			String examName=examinfo.getExamName();
			if(name.equals(examName)){
				listByName.add(examinfo);
			}
		}
		return listByName;
	}

	@Override
	public List<Examinfo> findExaminfoList() 
	{	
		ExaminfoExample examinfoExample= new ExaminfoExample();
		return examinfoMapper.selectByExample(examinfoExample);
	}

	@Override
	public Examinfo findbyId(BigDecimal examId) {
		// TODO 自动生成的方法存根
		return null;
	}

	

	
}
