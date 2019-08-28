package com.example.assignment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.model.Emp_details;

@Repository
public interface EmployeeDAO extends CrudRepository<Emp_details, Integer> {


}
