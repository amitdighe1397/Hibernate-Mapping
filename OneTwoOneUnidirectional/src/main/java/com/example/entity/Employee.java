package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeDetails employeedetails;

	public Employee() {
		super();
	}

	public Employee(int empId, String name, EmployeeDetails employeedetails) {
		super();
		this.empId = empId;
		this.name = name;
		this.employeedetails = employeedetails;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}

	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", employeedetails=" + employeedetails + "]";
	}

}
