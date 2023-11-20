package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repositry.EmployeeRepositry;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepositry.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepositry.findAll();
	}

	@Override
	public Employee getByEmployeeId(int id) {
		return employeeRepositry.findById(id).get();
	}

}
