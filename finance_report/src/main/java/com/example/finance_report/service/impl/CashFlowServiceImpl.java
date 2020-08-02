package com.example.finance_report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.finance_report.dao.CashFlowRepository;
import com.example.finance_report.model.CashFlow;
import com.example.finance_report.service.CashFlowService;

public class CashFlowServiceImpl implements CashFlowService{
	
	@Autowired
	CashFlowRepository cahsFlowRepository;
	
	public void add(CashFlow cashFlow) {
		cahsFlowRepository.save(cashFlow);
	}
	public void delete(Long id) {
		cahsFlowRepository.deleteById(id);
	}
	public CashFlow get(Long id) {
		return cahsFlowRepository.getOne(id);
	}
	public void update(CashFlow cashFlow) {
		cahsFlowRepository.save(cashFlow);
	}

}
