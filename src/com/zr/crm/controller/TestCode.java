package com.zr.crm.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zr.crm.dao.SubjectMapper;
import com.zr.crm.model.Subject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-applicationContext.xml")
public class TestCode
{
	@Autowired
	private SubjectMapper subjectMapper;

	@Test
	public void insert()
	{
		Subject subject = new Subject();
		subject.setSubjectName("Math");
		subject.setSubjectNo(new BigDecimal(4));
		subject.setSubjectPrjManager(new BigDecimal(2));
		subject.setSubjectTimes(new BigDecimal(3));
		subject.setCreteTime(new Date());
		subject.setUpdateTime(new Date());
		System.out.println(subject);
		subjectMapper.insert(subject);
		System.out.println(subjectMapper);
	}
}
