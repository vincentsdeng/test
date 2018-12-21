package com.zr.crm.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.zr.crm.dao.TestresultMapper;
import com.zr.crm.model.Testresult;
import com.zr.crm.model.TestresultExample;
import com.zr.crm.service.TestresultService;
@Service
 public class TestresultServiceImpl implements TestresultService {
	@Autowired
	private TestresultMapper testresultMapper;

	@Override
	public void saveTestresult(Testresult testresult) {
		testresultMapper.insert(testresult);
		
	}

	@Override
	public void updateTestresult(Testresult testresult) {
		testresultMapper.updateByPrimaryKey(testresult);
		
	}

	@Override
	public void deleteTestresult(Long id) {
	    testresultMapper.deleteByPrimaryKey(null);
		
	}

	@Override
	public List<Testresult> findbyName(String name) {
	    TestresultExample testresultExample=new TestresultExample();
	    List<Testresult> list=testresultMapper.selectByExample(testresultExample);
	    List<Testresult> listByName=new ArrayList<Testresult>();
	    for(Testresult testresult:list){
	    	Long testNo=testresult.getTestNo();
	    	if(name.equals(testNo)){
	    		listByName.add(testresult);
	    	}
	    }
		return listByName;
	}

	@Override
	public List<Testresult> findTestresultlist() {
	TestresultExample testresultExample=new TestresultExample();	
		return testresultMapper.selectByExample(testresultExample);
	}

	@Override
	public Testresult findbylist(Long testNo) {
	Testresult testresult=testresultMapper.selectByPrimaryKey(testNo);
		return testresult;
	}





}
