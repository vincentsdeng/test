package com.zr.crm.service;

import java.math.BigDecimal;
import java.util.List;



import com.zr.crm.model.Evaluationresult;

public interface EvaluationresultService {
	public void saveEvaluationresult(Evaluationresult evaluationresultMapper);
	
	public void updateEvaluationresult(Evaluationresult evaluationresultMapper);
	
	public void deleteEvaluationresult(BigDecimal id);
	
	public Evaluationresult findEvaluationresultById(BigDecimal id);
	
	public List<Evaluationresult>findEvaluationresultList();


	
}
