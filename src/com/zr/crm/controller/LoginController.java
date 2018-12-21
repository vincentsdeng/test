package com.zr.crm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;  
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  

import com.zr.crm.model.User;
import com.zr.crm.service.ILoginService;
import com.zr.crm.utils.JsonResponseResult;
import com.zr.crm.utils.SysConstant;

@Controller
public class LoginController {
	private Logger logger = Logger.getLogger(this.getClass());

	@Resource
	private ILoginService loginServiceImpl;

	@RequestMapping("/login/main")
	public ModelAndView main(HttpServletRequest req, Map<String,Object> map) {
		 
		ModelAndView mv=null;  
		mv=new ModelAndView("content/main/index"); 
		return mv;
	}

 
	protected void jsonToPage(String jsonResult , HttpServletResponse response){

		response.setContentType("application/json;charset=UTF-8");
		// 鑾峰彇jsonResult骞跺彂閫佸搷搴�
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println(jsonResult);
			out.flush();
			out.close();
		} catch (IOException e) {
			logger.error("杈撳嚭澶辫触", e);
		}
	}
	
	@RequestMapping("/login/doLogin")
	public String doLogin(String yzmbox ,@ModelAttribute("user") User user,
			HttpServletRequest request, HttpServletResponse response) { 
		JsonResponseResult json = JsonResponseResult.createSuccess();
	 
		json = JsonResponseResult.createSuccess();
		String jsonResult = json.toJSONString();
		
		request.getSession().setAttribute(SysConstant.USER_SESSION, user);
		jsonToPage(jsonResult, response);
		return null;
	}
	@RequestMapping("/doLogin")
	public ModelAndView login(HttpServletRequest req, Map<String,Object> map) {
		 
		ModelAndView mv=null;
	/*	User u = loginServiceImpl.Login(1L); 
		logger.info(u);
		if (u != null) {
		
			req.getSession().setAttribute("user", u);
			mv.addObject("birthday", u.getBirthday());
			System.out.println(u.getBirthday());
		}*/
	  	mv=new ModelAndView("content/main/index");
		return mv;
	}
}
