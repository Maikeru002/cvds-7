package com.miguel.barrera.model;

import jakarta.persistence.*;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;

	public Employee (String firstName,String lastName, String  role, Double salary){
		//this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.salary = salary; 
	}

	public Employee() {
		
	}

	public Long getEmployeeId() {
		return employeeId;
	}
    
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getRole() {
		return role;
	} 

	public Double getSalary() {
		return salary;
	}  

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	} 
}