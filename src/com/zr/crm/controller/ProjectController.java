package com.zr.crm.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.zr.crm.model.Projectinfo;
import com.zr.crm.service.ProjectinfoService;
import com.zr.crm.utils.DWZJsonResponseResult;

@Controller
@RequestMapping("pages")
public class ProjectController {

	@Autowired
	private ProjectinfoService projectinfoService;


	private static Logger logger = Logger.getLogger(UserController.class
			.getName());
	
	@RequestMapping("deletePro")
	public ModelAndView deleteProjectinfo(String id){
		projectinfoService.deleteProjectinfo(id);
		return new ModelAndView("pages/projectinfo/list");
	}

	@RequestMapping("/projectinfo/list")
	public ModelAndView findAllProject(HttpServletRequest request) {

		List<Projectinfo> proList = projectinfoService.findProjectinfoList();
		request.setAttribute("proList", proList);
		return new ModelAndView("pages/projectinfo/list");
	}

	@RequestMapping("findProject")
	public ModelAndView findProject(@RequestParam("projectinfo.priNo")String priNo, HttpServletRequest request) {
		
		List<Projectinfo> proList = projectinfoService.findById(priNo);
		request.setAttribute("proList", proList);
		return new ModelAndView("pages/projectinfo/list");
	}

	
	@RequestMapping("proAdd")
	public ModelAndView projectAdd(Projectinfo projectinfo,HttpServletResponse response) {
		
		DWZJsonResponseResult json = DWZJsonResponseResult.initSuccess();
		json.setNavTabId("list");
		jsonToPage(json.toJSONString(), response);
		
		if(Integer.parseInt(projectinfo.getPriType())==1){
			projectinfo.setPriType("开发");
		}else if(Integer.getInteger(projectinfo.getPriType())==2){
			projectinfo.setPriType("测试");
		}
		
		if(Integer.parseInt(projectinfo.getPriStatus())==3){
			projectinfo.setPriStatus("实训");
		}else if(Integer.parseInt(projectinfo.getPriStatus())==4){
			projectinfo.setPriStatus("就业");
		}
		
		projectinfoService.saveProjectinfo(projectinfo);
		return new ModelAndView("pages/projectinfo/list");
	}
	
	@RequestMapping("projectinfo/proAdd")
	public ModelAndView addProject(Projectinfo projectinfo,
			HttpServletResponse response) {
		return new ModelAndView("pages/projectinfo/proAdd");
	}
	
	@RequestMapping("updatePro1")
	public ModelAndView updateProject1(@RequestParam("id")String priNo,HttpServletRequest request){
		Projectinfo projectinfo = projectinfoService.findbyId(priNo);
		
		if(Integer.parseInt(projectinfo.getPriType())==1){
			projectinfo.setPriType("开发");
		}else if(Integer.getInteger(projectinfo.getPriType())==2){
			projectinfo.setPriType("测试");
		}
		
		if(Integer.parseInt(projectinfo.getPriStatus())==3){
			projectinfo.setPriStatus("实训");
		}else if(Integer.parseInt(projectinfo.getPriStatus())==4){
			projectinfo.setPriStatus("就业");
		}
		
		request.setAttribute("projectinfo", projectinfo);
		
		return new ModelAndView("pages/projectinfo/updatePro");
	}
	
	@RequestMapping("updatePro2")
	public ModelAndView updateProject2(Projectinfo projectinfo
			,HttpServletRequest request,HttpServletResponse response){
		
		if(Integer.parseInt(projectinfo.getPriType())==1){
			projectinfo.setPriType("开发");
		}else if(Integer.getInteger(projectinfo.getPriType())==2){
			projectinfo.setPriType("测试");
		}
		
		if(Integer.parseInt(projectinfo.getPriStatus())==3){
			projectinfo.setPriStatus("实训");
		}else if(Integer.parseInt(projectinfo.getPriStatus())==4){
			projectinfo.setPriStatus("就业");
		}
		
		DWZJsonResponseResult json = DWZJsonResponseResult.initSuccess();
		
		json.setNavTabId("list");
		jsonToPage(json.toJSONString(),response);
		
		projectinfoService.updateProjectinfo(projectinfo);
		return new ModelAndView("pages/projectinfo/list");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}


	private void jsonToPage(String jsonResult, HttpServletResponse response) {
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
