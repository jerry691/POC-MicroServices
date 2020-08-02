package com.example.finance_report.service;

import java.util.List;

import com.example.finance_report.model.Income;

public interface IncomeService {
	public void add(Income income);
	public void delete(Long id);
	public Income get(Long id);
	public void update(Income income);
	public List<Income> getAll();
}
