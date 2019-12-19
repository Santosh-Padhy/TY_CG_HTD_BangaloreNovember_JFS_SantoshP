package com.capg.mywebapp.dao;

import java.util.List;

import com.capg.mywebapp.beans.EmployeeInfo;

public interface EmployeeDao {

	public EmployeeInfo searchInfo( int empId);
	public EmployeeInfo authenticateInfo(int empId,String password);
	public boolean deleteEmployee(int empId);
	public boolean addEmployee(EmployeeInfo employeeInfo);
	public boolean updateEmployee(EmployeeInfo employeeInfo);
	public List<EmployeeInfo> getAllEmployees();
	
	
}
