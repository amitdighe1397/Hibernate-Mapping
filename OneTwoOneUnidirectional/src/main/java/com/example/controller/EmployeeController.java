package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee employee) {

		System.out.println(employee);
		
		Employee emp = employeeService.createEmployee(employee);
		
		System.out.println(emp);
		
		return emp;
	}

	@GetMapping("/getall")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/getbyid/{id}")
	public Employee getByEmployeeId(@PathVariable int id) {
		return employeeService.getByEmployeeId(id);
	}

}
