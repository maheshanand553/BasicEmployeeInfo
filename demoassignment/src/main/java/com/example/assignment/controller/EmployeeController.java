package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.exceptions.EmployeeNotFoundException;
import com.example.assignment.model.Emp_details;
import com.example.assignment.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	   @PostMapping("/addEmployee")
	public ResponseEntity <Emp_details> addEmployee(@RequestBody Emp_details employee)
	
	{
		
		service.addEmployee(employee);
         return new ResponseEntity<Emp_details>(employee, HttpStatus.OK);
	}
	

	@PutMapping("/updateEmployee/{e_id}")
	
	public ResponseEntity <Emp_details> updateEmployee(Integer e_id,@RequestBody Emp_details employee )	
	{
	try {
		service.updateEmployee(employee, e_id);
		return new ResponseEntity <Emp_details>(HttpStatus.OK);

	} catch (EmployeeNotFoundException e) {
		
	return new ResponseEntity<Emp_details>(HttpStatus.NOT_FOUND);
	}
	
	}
	@DeleteMapping("/deleteEmployee/{e_id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int e_id)
	  
	{
		try {
			service.deleteEmployee (e_id);
			return new ResponseEntity<String>("Record deleted",HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
		
		}
		return new ResponseEntity<String>("Record not found",HttpStatus.NOT_FOUND);
	}
	
	
	
   	@GetMapping("/displayAll")
	public ResponseEntity<List<Emp_details>>displayAll(){
		List<Emp_details> EmpList=service.displayAllEmployee();
for(Emp_details emp:EmpList) 
{
System.out.println(emp.getE_id());
}
return new ResponseEntity<List<Emp_details>>(EmpList,HttpStatus.OK);
}
}
	


