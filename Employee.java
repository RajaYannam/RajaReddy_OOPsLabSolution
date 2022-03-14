package com.mysytem.model;

public class Employee {
	
	public String empFirstName;
	public String empLastName;
	public String Department;
	public String empemailid;
	public String password;
	
	public Employee(String empFirstName,String empLastName) {
		this.empFirstName = empFirstName ;
		this.empLastName = empLastName ;
		
}

	@Override
	public String toString() {
		return "Employee [empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
	}
}