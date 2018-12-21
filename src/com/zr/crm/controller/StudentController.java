package com.zr.crm.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zr.crm.model.Studentinfo;
import com.zr.crm.service.StudentInfoService;

@Controller
@RequestMapping("/pages")
public class StudentController {
	
	@Autowired
	private StudentInfoService studentInfoService;
	
	
	private Studentinfo studentinfo;
	
	
	public Studentinfo getStudentinfo() {
		return studentinfo;
	}

	public void setStudentinfo(Studentinfo studentinfo) {
		this.studentinfo = studentinfo;
	}

	@RequestMapping("deleteStu")
	public ModelAndView deleteStudentinfo(BigDecimal id){		
		studentInfoService.deleteStudentinfo(id);
		return new ModelAndView("pages/studentinfo/studentList");
	}
	
	@RequestMapping(value="addStu")
	public ModelAndView addStudent(Studentinfo studentinfo){
		studentInfoService.saveStudentinfo(studentinfo);
		return new ModelAndView("pages/studentinfo/studentList");
	}
	
	@RequestMapping("studentinfo/addStu")
	public ModelAndView addStudent1(){
		return new ModelAndView("pages/studentinfo/stuAdd");
	}
	
	@RequestMapping("student")
	public ModelAndView findStudent(HttpServletRequest request){
		String name=request.getParameter("studentinfo.stuName");
		List<Studentinfo> stuList=studentInfoService.findByName(name);
		request.setAttribute("stuList", stuList);
		return new ModelAndView("pages/studentinfo/studentList");
	}
	

	@RequestMapping("/studentinfo/studentList")
	public ModelAndView findAllStudent(HttpServletRequest request){
		
		List<Studentinfo> stuList=studentInfoService.findStudentinfoList();
		request.setAttribute("stuList", stuList);
		return new ModelAndView("pages/studentinfo/studentList");
	}
}
