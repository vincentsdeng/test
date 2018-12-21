package com.zr.crm.service;


import java.math.BigDecimal;
import java.util.List;

import com.zr.crm.model.Subject;
import com.zr.crm.model.Testresult;


public interface TestresultService {
	
	
	public void  saveTestresult(Testresult testresult);
	
	public void updateTestresult(Testresult testresult);
	
	public void deleteTestresult(Long id);
	
	public List<Testresult> findbyName(String name);
	
	public List<Testresult> findTestresultlist();
	
	public Testresult findbylist(Long testNo);

}
