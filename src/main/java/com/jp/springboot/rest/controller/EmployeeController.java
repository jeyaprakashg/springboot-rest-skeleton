package com.jp.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.springboot.rest.model.Employee;
import com.jp.springboot.rest.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	//mapping the getBiddings() method to /bidding
	@GetMapping(value = "/employees")
	public List<Employee> getBiddings() {
		//finds all the products
		List<Employee> employees = employeeService.getAllEmployeeDetails();
		//returns the product list
		return employees;
	}
	
}
