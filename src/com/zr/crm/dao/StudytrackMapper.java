package com.zr.crm.dao;

import com.zr.crm.model.Studytrack;
import com.zr.crm.model.StudytrackExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudytrackMapper {
    int countByExample(StudytrackExample example);

    int deleteByExample(StudytrackExample example);

    int deleteByPrimaryKey(BigDecimal trackId);

    int insert(Studytrack record);

    int insertSelective(Studytrack record);

    List<Studytrack> selectByExample(StudytrackExample example);

    Studytrack selectByPrimaryKey(BigDecimal trackId);

    int updateByExampleSelective(@Param("record") Studytrack record, @Param("example") StudytrackExample example);

    int updateByExample(@Param("record") Studytrack record, @Param("example") StudytrackExample example);

    int updateByPrimaryKeySelective(Studytrack record);

    int updateByPrimaryKey(Studytrack record);
}