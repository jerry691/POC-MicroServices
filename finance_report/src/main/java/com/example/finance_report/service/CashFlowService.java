package com.example.finance_report.service;

import com.example.finance_report.model.CashFlow;

public interface CashFlowService {
	public void add(CashFlow cashFlow);
	public void delete(Long id);
	public CashFlow get(Long id);
	public void update(CashFlow cashFlow);
}
