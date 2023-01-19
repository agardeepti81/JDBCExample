package com.perscholas.dao;

import java.util.List;

import com.perscholas.models.Employees;

public interface EmployeeDAO {

	int createEmployee(Employees employees);
	List<Employees>getAllEmployees();
	int updateEmployee(Employees employees);
	int deleteEmployee(int empId);
}

