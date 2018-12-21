package com.zr.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zr.crm.model.User;
import com.zr.crm.service.IUserService;
import com.zr.crm.utils.PageBean;


/**
* @ClassName: UserController 
* @Description: 用户操作的控制层
* @author  
* @date  
*
 */
@Controller
@RequestMapping("user")
public class UserController   {
	private static Logger logger = Logger.getLogger(UserController.class
			.getName());

	@Autowired
	private IUserService iUserService;
	
	/**
	* @Title: doLogin 
	* @Description: 查询用户列表
	* @param yzmbox
	* @param innUser
	* @param request
	* @param response
	* @return    参数 
	* String  返回类型 
	* @throws
	 */
	@RequestMapping("/userList")
	public ModelAndView findUsers(@RequestParam("pageNum") int pageNum, String name,  HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("name", name);
		PageBean pageBean = new PageBean();
		pageBean.setCurrentPage(pageNum);
		try {
			List<User> list = iUserService.findUserPage(param, pageBean);
			request.setAttribute("pageBean", pageBean);
			request.setAttribute("userList", list);
		} catch (Exception e) {
			logger.error("用户查询错误", e);
		}
		return  new ModelAndView("content/user/userList");
	}
}