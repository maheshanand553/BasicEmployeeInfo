package com.example.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.assignment.exceptions.EmployeeNotFoundException;
import com.example.assignment.model.Emp_details;



public interface EmployeeService {

	public void addEmployee(Emp_details employee);
	public boolean updateEmployee(Emp_details employee, Integer e_id) throws EmployeeNotFoundException;
	public void deleteEmployee(int e_id) throws EmployeeNotFoundException;
	public  List<Emp_details> displayAllEmployee();
}
