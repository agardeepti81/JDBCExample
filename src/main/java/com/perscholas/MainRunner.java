package com.perscholas;

import com.perscholas.models.Employees;
import com.perscholas.services.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employees emp = new Employees(1705, "James", "Camroon", "x103", "JonesEdward@gmail.com", "5", 1611, "Sales Rep", 15);
		EmployeeService es = new EmployeeService();
//		System.out.println(es.getAllEmployees());
		
//		System.out.println(es.createEmployee(emp));
//		System.out.println(es.updateEmployee(emp));
		System.out.println(es.deleteEmployee(1703));	
	}

}
