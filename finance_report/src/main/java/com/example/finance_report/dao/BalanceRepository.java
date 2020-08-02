package com.example.finance_report.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finance_report.model.Balance;

public interface BalanceRepository  extends JpaRepository<Balance,Long>{

}
