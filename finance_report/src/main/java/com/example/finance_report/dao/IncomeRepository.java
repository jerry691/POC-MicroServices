package com.example.finance_report.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finance_report.model.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income,Long>{
	
}
