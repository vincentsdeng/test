package com.zr.crm.dao;

import com.zr.crm.model.Studentinfo;
import com.zr.crm.model.StudentinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentinfoMapper {
    int countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);

    int deleteByPrimaryKey(BigDecimal stuId);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(BigDecimal stuId);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
}