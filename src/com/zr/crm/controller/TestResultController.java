package com.zr.crm.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zr.crm.model.Studentinfo;
import com.zr.crm.model.Subject;
import com.zr.crm.model.Testresult;
import com.zr.crm.service.TestresultService;

@Controller
@RequestMapping("/pages")
public class TestResultController {
	private static final long No = 0;
	@Autowired
	private TestresultService testresultService;

	 
	
	
	@RequestMapping("/Testresult/studentResult")
	public ModelAndView findAllTestresult(HttpServletRequest request){

		List<Testresult>  stuList=testresultService.findTestresultlist();
		request.setAttribute("stuList", stuList);
		return new ModelAndView("pages/testresult/selectresult");
	}
	

}
