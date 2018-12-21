package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.AttendanceinfoMapper;
import com.zr.crm.model.Attendanceinfo;
import com.zr.crm.model.AttendanceinfoExample;
@Service
public class AttendanceinfoServiceImpl implements AttendanceinfoService{

	@Autowired
	private AttendanceinfoMapper attendanceinfoMapper;

	@Override
	public void saveAttendanceinfo(Attendanceinfo attendanceinfo) {
		attendanceinfoMapper.insert(attendanceinfo);
		
	}

	@Override
	public void updateAttendanceinfo(Attendanceinfo attendanceinfo) {
		attendanceinfoMapper.updateByPrimaryKey(attendanceinfo);
		
	}

	@Override
	public void deleteAttendanceinfo(BigDecimal id) {
		attendanceinfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Attendanceinfo findAttendanceinfoById(BigDecimal id) {
		return attendanceinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Attendanceinfo> findAttendanceinfoMapperList() {
		AttendanceinfoExample attendanceinfoExample = new AttendanceinfoExample();
		return attendanceinfoMapper.selectByExample(attendanceinfoExample);
	}
}
