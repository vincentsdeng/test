package com.zr.crm.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zr.crm.model.Attendanceinfo;

import com.zr.crm.service.AttendanceinfoService;

@Controller
@RequestMapping("/emp")
public class AttendanceinfoContorller {
	@Autowired
	private AttendanceinfoService attendanceinfoService;
	
	private Attendanceinfo attendanceinfo;
	
	public Attendanceinfo getAttendanceinfo() {
		return attendanceinfo;
	}

	public void setAttendanceinfo(Attendanceinfo attendanceinfo) {
		this.attendanceinfo = attendanceinfo;
	}

	@RequestMapping("deleteAtt")
	public ModelAndView deleteAttendanceinfo(BigDecimal id){
		attendanceinfoService.deleteAttendanceinfo(id);
		return new ModelAndView("pages/attendanceinfo/attenList");
	}
	
	@RequestMapping(value="addAtt")
	public ModelAndView addAttendanceinfo(){
		
		Attendanceinfo attendanceinfo = new Attendanceinfo();
		attendanceinfoService.saveAttendanceinfo(attendanceinfo);
		return new ModelAndView("pages/attendanceinfo/attenList");
	}
	
	@RequestMapping("attendanceinfo/addAtt")
	public ModelAndView addAttendAnce(){
		
		return new ModelAndView("pages/attendanceinfo/attenAdd");
	}
	
	@RequestMapping("/attendanceinfo/attendanceinfoList")
	public ModelAndView findAllAttendAnceinfo(HttpServletRequest httpServletRequest){
		
		List<Attendanceinfo> attenList = attendanceinfoService.findAttendanceinfoMapperList();
		httpServletRequest.setAttribute("attenList", attenList);
		return new ModelAndView("pages/attendanceinfo/attenList");
	}
}
