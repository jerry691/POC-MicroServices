package com.example.finance_report.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finance_report.dao.IncomeRepository;
import com.example.finance_report.model.Income;
import com.example.finance_report.service.IncomeService;

@Service
public class IncomeServiceImpl implements IncomeService{
	
	@Autowired
	IncomeRepository incomeRepository;
	
	public void add(Income income) {
		incomeRepository.save(income);
	}
	
	public void delete(Long id) {
		incomeRepository.deleteById(id);
	}
	public Income get(Long id) {
		return incomeRepository.getOne(id);
	}
	public void update(Income income) {
		incomeRepository.save(income);
	}
	
	public List<Income> getAll(){
		return incomeRepository.findAll();
	}

}
