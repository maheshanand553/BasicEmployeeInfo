package com.example.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.dao.EmployeeDAO;
import com.example.assignment.exceptions.EmployeeNotFoundException;
import com.example.assignment.model.Emp_details;

@Service
public class EmpServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public void addEmployee(Emp_details employee) {
		
		dao.save(employee);
		
		
	}

	@Override
	public boolean updateEmployee(Emp_details employee, Integer e_id) throws EmployeeNotFoundException 
	{
	
        boolean found=dao.existsById(e_id);
        if(!found)
        {
        	throw new EmployeeNotFoundException("Employee not found");
        }
        else {
        	dao.save(employee);
        	found = true;
        }
        return found;
        
}

	@Override
	public void deleteEmployee(int e_id) throws EmployeeNotFoundException {
		
		Emp_details employee = dao.findById(e_id).get();
		if(employee == null)
		{
			throw new EmployeeNotFoundException("Employee details not found");
		}
		else {
			dao.deleteById(e_id);
		}
	}

	@Override
	public List<Emp_details> displayAllEmployee() {
		List<Emp_details>Emplist=(List<Emp_details>) dao.findAll();
		return Emplist;
		
	}
	
	
}
