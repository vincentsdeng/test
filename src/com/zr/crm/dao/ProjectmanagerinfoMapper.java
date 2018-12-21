package com.zr.crm.dao;

import com.zr.crm.model.Projectmanagerinfo;
import com.zr.crm.model.ProjectmanagerinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectmanagerinfoMapper {
    int countByExample(ProjectmanagerinfoExample example);

    int deleteByExample(ProjectmanagerinfoExample example);

    int deleteByPrimaryKey(BigDecimal prjMngId);

    int insert(Projectmanagerinfo record);

    int insertSelective(Projectmanagerinfo record);

    List<Projectmanagerinfo> selectByExample(ProjectmanagerinfoExample example);

    Projectmanagerinfo selectByPrimaryKey(BigDecimal prjMngId);

    int updateByExampleSelective(@Param("record") Projectmanagerinfo record, @Param("example") ProjectmanagerinfoExample example);

    int updateByExample(@Param("record") Projectmanagerinfo record, @Param("example") ProjectmanagerinfoExample example);

    int updateByPrimaryKeySelective(Projectmanagerinfo record);

    int updateByPrimaryKey(Projectmanagerinfo record);
}