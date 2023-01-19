package com.perscholas.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perscholas.dao.EmployeeDAO;
import com.perscholas.dto.EmployeeDTO;
import com.perscholas.models.Employees;

public class EmployeeService implements EmployeeDAO {

	static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels";
	static final String USER = "root";
	static final String PASS = "Deepti2023";

	@Override
	public int createEmployee(Employees employees) {
		int rs = 0;
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) 
		{
			String sqlQuery = "INSERT INTO EMPLOYEES "
					+ "(officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) "
					+ "VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sqlQuery); 
			ps.setString(1,employees.getOfficeCode());
			ps.setString(2,employees.getFirstName());
			ps.setString(3,employees.getLastName());
			ps.setString(4,employees.getEmail());
			ps.setString(5,employees.getExtension());
			ps.setInt(6,employees.getReportsTo());
			ps.setInt(7,employees.getVacationHours());
			ps.setInt(8,employees.getEmployeeNumber());
			ps.setString(9,employees.getJobTitle());
			rs = ps.executeUpdate();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return rs;
	}

	@Override
	public List<Employees> getAllEmployees() {

		List<Employees> listEmp = new ArrayList<>();
		// connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

			// prepared statement
			PreparedStatement ps = conn.prepareStatement("select * from employees");
			// result set
			ResultSet rs = ps.executeQuery();
			// convert result set to employee object
			while (rs.next()) {

				// int employeeNumber, String lastName, String firstName, String extension,
				// String email,
				// String officeCode, int reportsTo, String jobTitle, int vacationHours
				Employees e = new Employees(rs.getInt("employeeNumber"), rs.getString("lastName"),
						rs.getString("firstName"), rs.getString("extension"), rs.getString("email"),
						rs.getString("officeCode"), rs.getInt("reportsTo"), rs.getString("jobTitle"),
						rs.getInt("VacationHours")

				);
				// add object into list
				listEmp.add(e);

			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return listEmp;
	}

	@Override
	public int updateEmployee(Employees employees) {
		int rs = 0;
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) 
		{
			String sqlQuery = "UPDATE EMPLOYEES SET firstName=?,lastName=?,extension=?, email=?, officeCode=?, reportsTo=?, jobTitle=?, VacationHours=? where employeeNumber=?";
			PreparedStatement ps = conn.prepareStatement(sqlQuery); 
			ps.setString(1,employees.getFirstName());
			ps.setString(2,employees.getLastName());
			ps.setString(3,employees.getExtension());
			ps.setString(4, employees.getEmail());
			ps.setString(5,employees.getOfficeCode());
			ps.setInt(6,employees.getReportsTo());
			ps.setString(7, employees.getJobTitle());
			ps.setInt(8, employees.getVacationHours());
			ps.setInt(9,employees.getEmployeeNumber());
			rs = ps.executeUpdate();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return rs;
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<EmployeeDTO> getEmployeeEmails(){
		
		List<EmployeeDTO> listEmp = new ArrayList<>();
		// connection 
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); ){
			
			// prepared statement 
				PreparedStatement ps = conn.prepareStatement("select * from employees");
			// result set 
				ResultSet rs = ps.executeQuery();
			// convert result set to employee object
				while(rs.next()) {
					
					//int employeeNumber, String lastName, String firstName, String extension, String email,
					// String officeCode, int reportsTo, String jobTitle, int vacationHours
					EmployeeDTO e =new EmployeeDTO(
							rs.getInt("employeeNumber"),
							rs.getString("email")
							);
					// add object into list 
					listEmp.add(e);
				
				}
			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return listEmp;
}
}
