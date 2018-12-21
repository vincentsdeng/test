package com.zr.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zr.crm.model.Projectinfo;
import com.zr.crm.model.ProjectinfoExample;

public interface ProjectinfoMapper {
    int countByExample(ProjectinfoExample example);

    int deleteByExample(ProjectinfoExample example);

    int deleteByPrimaryKey(String priNo);

    int insert(Projectinfo record);

    int insertSelective(Projectinfo record);

    List<Projectinfo> selectByExample(ProjectinfoExample example);

    Projectinfo selectByPrimaryKey(String priNo);

    int updateByExampleSelective(@Param("record") Projectinfo record, @Param("example") ProjectinfoExample example);

    int updateByExample(@Param("record") Projectinfo record, @Param("example") ProjectinfoExample example);

    int updateByPrimaryKeySelective(Projectinfo record);

    int updateByPrimaryKey(Projectinfo record);
}