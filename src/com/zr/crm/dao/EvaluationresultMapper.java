package com.zr.crm.dao;

import com.zr.crm.model.Evaluationresult;
import com.zr.crm.model.EvaluationresultExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationresultMapper {
    int countByExample(EvaluationresultExample example);

    int deleteByExample(EvaluationresultExample example);

    int deleteByPrimaryKey(BigDecimal resultId);

    int insert(Evaluationresult record);

    int insertSelective(Evaluationresult record);

    List<Evaluationresult> selectByExampleWithBLOBs(EvaluationresultExample example);

    List<Evaluationresult> selectByExample(EvaluationresultExample example);

    Evaluationresult selectByPrimaryKey(BigDecimal resultId);

    int updateByExampleSelective(@Param("record") Evaluationresult record, @Param("example") EvaluationresultExample example);

    int updateByExampleWithBLOBs(@Param("record") Evaluationresult record, @Param("example") EvaluationresultExample example);

    int updateByExample(@Param("record") Evaluationresult record, @Param("example") EvaluationresultExample example);

    int updateByPrimaryKeySelective(Evaluationresult record);

    int updateByPrimaryKeyWithBLOBs(Evaluationresult record);

    int updateByPrimaryKey(Evaluationresult record);
}