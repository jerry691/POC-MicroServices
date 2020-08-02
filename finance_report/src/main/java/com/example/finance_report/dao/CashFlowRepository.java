package com.example.finance_report.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finance_report.model.CashFlow;

public interface CashFlowRepository extends JpaRepository<CashFlow,Long>{

}
