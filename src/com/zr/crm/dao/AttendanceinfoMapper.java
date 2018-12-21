package com.zr.crm.dao;

import com.zr.crm.model.Attendanceinfo;
import com.zr.crm.model.AttendanceinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceinfoMapper {
    int countByExample(AttendanceinfoExample example);

    int deleteByExample(AttendanceinfoExample example);

    int deleteByPrimaryKey(BigDecimal stuId);

    int insert(Attendanceinfo record);

    int insertSelective(Attendanceinfo record);

    List<Attendanceinfo> selectByExample(AttendanceinfoExample example);

    Attendanceinfo selectByPrimaryKey(BigDecimal stuId);

    int updateByExampleSelective(@Param("record") Attendanceinfo record, @Param("example") AttendanceinfoExample example);

    int updateByExample(@Param("record") Attendanceinfo record, @Param("example") AttendanceinfoExample example);

    int updateByPrimaryKeySelective(Attendanceinfo record);

    int updateByPrimaryKey(Attendanceinfo record);
}