package com.perscholas.dto;

public class EmployeeDTO {

	private int employeeNumber;
	private String email;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeNumber=" + employeeNumber + ", email=" + email + "]";
	}
	public EmployeeDTO(int employeeNumber, String email) {
		super();
		this.employeeNumber = employeeNumber;
		this.email = email;
	}
	
}
