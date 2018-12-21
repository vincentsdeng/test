package com.zr.crm.dao;

import com.zr.crm.model.Testresult;
import com.zr.crm.model.TestresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestresultMapper {
    int countByExample(TestresultExample example);

    int deleteByExample(TestresultExample example);

    int deleteByPrimaryKey(Long testNo);

    int insert(Testresult record);

    int insertSelective(Testresult record);

    List<Testresult> selectByExample(TestresultExample example);

    Testresult selectByPrimaryKey(Long testNo);

    int updateByExampleSelective(@Param("record") Testresult record, @Param("example") TestresultExample example);

    int updateByExample(@Param("record") Testresult record, @Param("example") TestresultExample example);

    int updateByPrimaryKeySelective(Testresult record);

    int updateByPrimaryKey(Testresult record);
   
}