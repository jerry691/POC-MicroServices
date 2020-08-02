package com.example.finance_report.service;

import com.example.finance_report.model.Balance;
import com.example.finance_report.model.CashFlow;

public interface BalanceService {
	
	public void add(Balance cashFlow);
	public void delete(Long id);
	public CashFlow get(Long id);
	public void update(Balance cashFlow);

}
