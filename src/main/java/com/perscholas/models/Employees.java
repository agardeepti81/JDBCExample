package com.perscholas.models;

import java.util.Objects;

public class Employees {
	// fields

	private int employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private String officeCode;
	private int reportsTo;
	private String jobTitle;
	private int vacationHours;

	// constructors

	public Employees() {
	}

	public Employees(int employeeNumber, String lastName, String firstName, String extension, String email,
			String officeCode, int reportsTo, String jobTitle, int vacationHours) {
		super();
		this.employeeNumber = employeeNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.extension = extension;
		this.email = email;
		this.officeCode = officeCode;
		this.reportsTo = reportsTo;
		this.jobTitle = jobTitle;
		this.vacationHours = vacationHours;
	}

	// getter and setters

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public int getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getVacationHours() {
		return vacationHours;
	}

	public void setVacationHours(int vacationHours) {
		this.vacationHours = vacationHours;
	}

	// tostring and hashcode and equals

	@Override
	public int hashCode() {
		return Objects.hash(email, employeeNumber, extension, firstName, jobTitle, lastName, officeCode, reportsTo,
				vacationHours);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(email, other.email) && employeeNumber == other.employeeNumber
				&& Objects.equals(extension, other.extension) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(jobTitle, other.jobTitle) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(officeCode, other.officeCode) && reportsTo == other.reportsTo
				&& vacationHours == other.vacationHours;
	}

	@Override
	public String toString() {
		return "Employees \n[employeeNumber=" + employeeNumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", extension=" + extension + ", email=" + email + ", officeCode=" + officeCode + ", reportsTo="
				+ reportsTo + ", jobTitle=" + jobTitle + ", vacationHours=" + vacationHours + "\n]";
	}

}
