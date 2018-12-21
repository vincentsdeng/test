package com.zr.crm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zr.crm.model.Studentinfo;
import com.zr.crm.model.Subject;
import com.zr.crm.service.SubjectService;
import com.zr.crm.utils.DWZJsonResponseResult;

@Controller
@RequestMapping("/pages")
public class SubjectController {
	
	private static Logger logger = Logger.getLogger(UserController.class
			.getName());

	protected void jsonToPage(String jsonResult , HttpServletResponse response){

		response.setContentType("application/json;charset=UTF-8");
		// 获取jsonResult并发送响应
		PrintWriter out;
		try {
		out = response.getWriter();
		out.println(jsonResult);
		out.flush();
		out.close();
		} catch (IOException e) {
		logger.error("输出失败", e);
		}
		}
	
	@Autowired
	private SubjectService subjectService;


	@RequestMapping("subjectdelete")
	public ModelAndView deleteSubject(BigDecimal id) {
		subjectService.deleteSubject(id);;
		return new ModelAndView("pages/subject/subjectList");
	}

	@RequestMapping("subjectadd")
	public ModelAndView addSubject(Subject subject,HttpServletRequest request,HttpServletResponse response) {
		
		DWZJsonResponseResult json = DWZJsonResponseResult.initSuccess();
		json.setNavTabId("studentList");
		jsonToPage(json.toJSONString(),response);
		subjectService.saveSubject(subject);
		return new ModelAndView("pages/subject/subjectList");
	}

	@RequestMapping("subject/subjectadd")
	public ModelAndView addSubject1() {
		return new ModelAndView("pages/subject/subjectAdd");
	}

	@RequestMapping("subject")
	public ModelAndView findSubject(HttpServletRequest request) {
		String name = request.getParameter("subject.stuName");
		List<Subject> stuList = subjectService.findByName(name);
		request.setAttribute("stuList", stuList);
		return new ModelAndView("pages/subject/subjectList");
	}

	@RequestMapping("/subject/subjectList")
	public ModelAndView findAllStudent(HttpServletRequest request) {

		List<Subject> stuList = subjectService.findSubjectList();
		request.setAttribute("stuList", stuList);
		return new ModelAndView("pages/subject/subjectList");
	}
	
	@RequestMapping("update1")
	public ModelAndView updateSubject1(@RequestParam("id") BigDecimal stuId, @RequestParam("pageNum") String pageNum, HttpServletRequest request){
		Subject subject=subjectService.findbyId(stuId);
		
		request.setAttribute("subject", subject);
		request.setAttribute("pageNum", pageNum);
		return new ModelAndView("pages/subject/subjectupdate");
		
	}
	
	@RequestMapping("update2")
	public ModelAndView updateSubject2(Subject subject,HttpServletRequest request,HttpServletResponse response){
		
		DWZJsonResponseResult json = DWZJsonResponseResult.initSuccess();
		
		json.setNavTabId("subjectList");
		jsonToPage(json.toJSONString(),response);
		
		subjectService.updateSubject(subject);
		return new ModelAndView("pages/subject/subjectList");
	}
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	}
	
	
	
}
