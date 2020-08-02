package com.example.finance_report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.finance_report.dao.BalanceRepository;
import com.example.finance_report.model.Balance;


public class BalanceServiceImpl {

	@Autowired
	BalanceRepository banlanceRepository;
	
	public void add(Balance banlance) {
		banlanceRepository.save(banlance);
	}
	
	public void delete(Long id) {
		banlanceRepository.deleteById(id);
	}
	public Balance get(Long id) {
		return banlanceRepository.getOne(id);
	}
	public void update(Balance balance) {
		banlanceRepository.save(balance);
	}

	
}
