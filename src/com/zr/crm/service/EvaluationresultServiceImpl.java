package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.crm.dao.EvaluationresultMapper;
import com.zr.crm.model.Evaluationresult;
import com.zr.crm.model.EvaluationresultExample;
@Service
public class EvaluationresultServiceImpl implements EvaluationresultService{

	@Autowired
	private EvaluationresultMapper evaluationresultMapper;
	
	@Override
	public void saveEvaluationresult(
			Evaluationresult evaluationresult) {
	
		evaluationresultMapper.insert(evaluationresult);
	}

	@Override
	public void updateEvaluationresult(
			Evaluationresult evaluationresult) {
		
		evaluationresultMapper.updateByPrimaryKey(evaluationresult);
	}

	@Override
	public void deleteEvaluationresult(BigDecimal id) {
		
		evaluationresultMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Evaluationresult findEvaluationresultById(BigDecimal id) {
		
		return evaluationresultMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Evaluationresult> findEvaluationresultList() {
		
		EvaluationresultExample evaluationresultExample = new EvaluationresultExample();
		
		return evaluationresultMapper.selectByExample(evaluationresultExample);
	}

}
