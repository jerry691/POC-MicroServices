package com.example.finance_report.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance_report.model.Income;
import com.example.finance_report.service.IncomeService;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IncomeController {
	
	@Autowired
	IncomeService incomeService;
	
	@GetMapping("/income")
	public List<Income> getAllIncome(){
		return incomeService.getAll();
	}
	
	@GetMapping("/income/{id}")
	public ResponseEntity<Income> getIncomeById(@PathVariable(value = "id") Long incomeId)
	       {
	        Income income = incomeService.get(incomeId);	         
	        return ResponseEntity.ok().body(income);
	 }
	
	@PostMapping("/income")	
    public void createIncome(@RequestBody Income income) {
        incomeService.add(income);
    }
	
	
	@PutMapping("/income")
	 public void updateIncome(@PathVariable(value = "id") Long incomeId,
	         @RequestBody Income income) {
	       incomeService.update(income);
	 }
	
	@DeleteMapping("/income/{id}")
	public void deleteIncomeById(@PathVariable(value = "id") Long incomeId) {
		incomeService.delete(incomeId);
	}
	
}
