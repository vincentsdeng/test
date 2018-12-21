package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.List;



import com.zr.crm.model.Attendanceinfo;

public interface AttendanceinfoService {
		public void saveAttendanceinfo(Attendanceinfo attendanceinfo);
		
		public void updateAttendanceinfo(Attendanceinfo attendanceinfo);
		
		public void deleteAttendanceinfo(BigDecimal id);
		
		public Attendanceinfo findAttendanceinfoById(BigDecimal id);
		
		public List<Attendanceinfo>findAttendanceinfoMapperList();

		
		
		
}
