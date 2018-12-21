package com.zr.crm.controller;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zr.crm.model.Projectmanagerinfo;
import com.zr.crm.service.impl.ProjectmanagerinfoImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-applicationContext.xml")
public class TestCodeForProjectManagerInfoController {
	
	@Autowired
	private ProjectmanagerinfoImpl pImpl;
	
	@Test
	public void testSave() {
		Projectmanagerinfo pi= new Projectmanagerinfo();
		pi.setPrjMngId(new BigDecimal(1));
		pi.setPrjMngName("zqy");
		pi.setPrjMngMajor("javaWeb");
		pi.setPrjMngJoin(new Date());
		pi.setPrjMngYears(new BigDecimal(6));
		pi.setCreteTime(new Date());
		pi.setUpdateTime(new Date());
		pImpl.save(pi);
	}

}
