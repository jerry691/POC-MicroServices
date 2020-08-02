package com.example.finance_report.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Balance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Long number;
	Date time;
}
