package com.jsp.employee;

public class Employee {

	private int emp_id;
	private String name;
	private String email;

	Employee() {
		System.out.println("employee object created by spring");
	}

	public int getEmp_id() {
		return emp_id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void employeeDetails() {
		System.out.println("ID of employee: " + emp_id);
		System.out.println("Name of employee: " + name);
		System.out.println("Email of employee: " + email);
	}

}
