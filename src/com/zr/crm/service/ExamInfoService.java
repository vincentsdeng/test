package com.zr.crm.service;
import java.math.BigDecimal;
import java.util.List;

import com.zr.crm.model.Examinfo;
import com.zr.crm.model.Studentinfo;

public interface ExamInfoService
{
	public void insertExaminfo(Examinfo examinfo);
	
	public void updateExaminfo(Examinfo examinfo);
	
	public void deleteExaminfo(BigDecimal id);
	
	public List<Examinfo> findByName(String examId);
	
	public List<Examinfo> findExaminfoList();
	
	public Examinfo findbyId(BigDecimal examId);
}
