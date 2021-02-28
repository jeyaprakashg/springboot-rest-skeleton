package com.jp.springboot.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.springboot.rest.model.Employee;

@Service
public class EmployeeService {
	
	public List<Employee> getAllEmployeeDetails() {
		//creating an object of ArrayList
		ArrayList<Employee> employees = new ArrayList<Employee>();
		//adding BiddingRequests to the List
		employees.add(new Employee(100, "Jegan", "18, Koramangala Road, Bangalore"));
		employees.add(new Employee(101, "Thomas", "27, Thalacherry Street, Nagpur"));
		employees.add(new Employee(102, "Arasu", "9, Nagar, Reddiarpatti, Madurai"));
		//returns a list of Employees
		return employees;
	}
}
