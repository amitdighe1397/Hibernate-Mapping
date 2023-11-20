package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {

	@Id
	private int empdetailid;

	private int age;

	private String state;

	private int empid;

	public EmployeeDetails() {
		super();

	}

	public int getEmpdetailid() {
		return empdetailid;
	}

	public void setEmpdetailid(int empdetailid) {
		this.empdetailid = empdetailid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empdetailid=" + empdetailid + ", age=" + age + ", state=" + state + ", empid=" + empid
				+ "]";
	}

}
