package com.zr.crm.dao;

import com.zr.crm.model.Examinfo;
import com.zr.crm.model.ExaminfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExaminfoMapper {
    int countByExample(ExaminfoExample example);

    int deleteByExample(ExaminfoExample example);

    int deleteByPrimaryKey(BigDecimal examId);

    int insert(Examinfo record);

    int insertSelective(Examinfo record);

    List<Examinfo> selectByExample(ExaminfoExample example);

    Examinfo selectByPrimaryKey(BigDecimal examId);

    int updateByExampleSelective(@Param("record") Examinfo record, @Param("example") ExaminfoExample example);

    int updateByExample(@Param("record") Examinfo record, @Param("example") ExaminfoExample example);

    int updateByPrimaryKeySelective(Examinfo record);

    int updateByPrimaryKey(Examinfo record);
}