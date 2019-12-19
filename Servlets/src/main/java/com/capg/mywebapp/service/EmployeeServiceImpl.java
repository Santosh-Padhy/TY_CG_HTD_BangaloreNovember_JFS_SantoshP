package com.capg.mywebapp.service;
import java.util.List;

import com.capg.mywebapp.beans.EmployeeInfo;
import com.capg.mywebapp.dao.EmployeeDao;
import com.capg.mywebapp.dao.*;
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public EmployeeInfo searchInfo(int empId) {
		
		return dao.searchInfo(empId);
	}

	@Override
	public EmployeeInfo authenticateInfo(int empId, String password) {
		return dao.authenticateInfo(empId, password);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
		
	}

	@Override
	public boolean addEmployee(EmployeeInfo employeeInfo) {
		return dao.addEmployee(employeeInfo);
	}

	@Override
	public boolean updateEmployee(EmployeeInfo employeeInfo) {
		return dao.updateEmployee(employeeInfo);
	}

	@Override
	public List<EmployeeInfo> getAllEmployees() {
		return dao.getAllEmployees();
	}	
}
