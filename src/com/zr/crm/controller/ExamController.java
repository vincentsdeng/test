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










import com.zr.crm.model.Examinfo;
import com.zr.crm.model.Studentinfo;
import com.zr.crm.service.ExamInfoService;
import com.zr.crm.utils.DWZJsonResponseResult;

@Controller
@RequestMapping("/pages")
public class ExamController {
	private static Logger logger = Logger.getLogger(UserController.class
			.getName());
	
	@Autowired
	private ExamInfoService examInfoService;
	
	
	/*private Examinfo examinfo;
	
	public Examinfo getExaminfo() {
		return examinfo;
	}


	public void setExaminfo(Examinfo examinfo) {
		this.examinfo = examinfo;
	}*/


	@RequestMapping("deleteExam")
	public ModelAndView deleteExaminfo(BigDecimal id )
	{
		examInfoService.deleteExaminfo(id);
		return new ModelAndView("pages/examinfo/examList");
	}
	
	
	@RequestMapping(value="addExam")
	public  ModelAndView addExam(Examinfo examinfo,HttpServletRequest request,HttpServletResponse response )
	{
        DWZJsonResponseResult json = DWZJsonResponseResult.initSuccess();
		
		json.setNavTabId("examList");
		jsonToPage(json.toJSONString(),response);
		
		examInfoService.insertExaminfo(examinfo);
		return new ModelAndView("pages/examinfo/examList");
	}
	
	
	@RequestMapping("examinfo/examAdd")
	public ModelAndView addExam1()
	{
		return new ModelAndView("pages/examinfo/examAdd");
	}
	
	
	@RequestMapping("examUpdate2")
	public ModelAndView updateExam2(Examinfo examinfo,HttpServletRequest request,HttpServletResponse response)
	{
        DWZJsonResponseResult json = DWZJsonResponseResult.initSuccess();
		
		json.setNavTabId("examList");
		jsonToPage(json.toJSONString(),response);
		
		examInfoService.updateExaminfo(examinfo);
		return new ModelAndView("pages/examinfo/examList");
	}
	
	
	@RequestMapping("examUpdate1")
	public ModelAndView updateExam1(@RequestParam("id") BigDecimal examId, @RequestParam("pageNum") String pageNum, HttpServletRequest request){
		Examinfo examinfo=examInfoService.findbyId(examId);
		
		request.setAttribute("examinfo", examinfo);
		request.setAttribute("pageNum", pageNum);
		return new ModelAndView("pages/examinfo/examUpdate");
	}
	
	
	@RequestMapping("exam")
	public ModelAndView findExam(@RequestParam("examinfo.examName")String examName, HttpServletRequest request)
	{
		String name = request.getParameter("examinfo.examName");
		List<Examinfo> examList=examInfoService.findByName(name);
		request.setAttribute("examList",examList);
		return new ModelAndView("pages/examinfo/examList");
	}
	
	
	@RequestMapping("/examinfo/examList")
	public ModelAndView finAllExam(HttpServletRequest request)
	{
		List<Examinfo> examList = examInfoService.findExaminfoList();
		request.setAttribute("examList", examList);
		return new ModelAndView("pages/examinfo/examList");
	}
	
	

	@InitBinder
	public void initBinder(WebDataBinder binder)
	{    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	}
	

	protected void jsonToPage(String jsonResult, HttpServletResponse response) 
	{
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
}
