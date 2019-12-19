package com.capg.mywebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.mywebapp.beans.EmployeeInfo;

public class EmployeeDaoImpl implements EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeepersistenceunit");
	@Override
	public EmployeeInfo searchInfo(int empId) {
		
		EntityManager manager = entityManagerFactory.createEntityManager();
	EmployeeInfo empInfo=manager.find(EmployeeInfo.class, empId);
		manager.close();
		
	return empInfo;
	}

	@Override
	public EmployeeInfo authenticateInfo(int empId, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDelete = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfo employeeInfo = manager.find(EmployeeInfo.class,empId);
		EntityTransaction transaction = null;
		if(employeeInfo!=null)
		{
			transaction =manager.getTransaction();
			transaction.begin();
			manager.persist(employeeInfo);
			transaction.commit();
			isDelete = true;
		}
		return isDelete;
	}
	@Override
	public boolean addEmployee(EmployeeInfo employeeInfo) {
		boolean isAdded = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
EntityTransaction transaction  = null;
try {
	transaction = manager.getTransaction();
	transaction.begin();
	manager.persist(employeeInfo);
	isAdded = true;
}
catch(Exception e)
{
	e.printStackTrace();
}	
		return isAdded;
	}
	@Override
	public boolean updateEmployee(EmployeeInfo employeeInfo) {
	boolean isUpdated=false;
	EntityManager manager = entityManagerFactory.createEntityManager();
	EmployeeInfo existingemployeeinfo = manager.find(EmployeeInfo.class,employeeInfo.getEmpid());
			EntityTransaction  transaction = manager.getTransaction();
	if(existingemployeeinfo!=null )
	{
		transaction.begin();
		try {
			String newName = employeeInfo.getName();
			if(newName!=null&&!newName.isEmpty()) {
				existingemployeeinfo.setName(newName);
			}
			int newAge =existingemployeeinfo .getAge();
			if(newAge>18) {
				existingemployeeinfo.setAge(newAge);
			}
			double newSalary = existingemployeeinfo .getSalary();
					if(newSalary>0) {
						existingemployeeinfo.setSalary(newSalary);
					}
					String newDesignation = existingemployeeinfo .getDesignation();
					if(newDesignation!=null&&!newDesignation.isEmpty()) {
						
						existingemployeeinfo.setDesignation(newDesignation);
					}
					String newPassword = existingemployeeinfo.getPassword();
					if(newPassword!=null&&newPassword.isEmpty())
					{
						existingemployeeinfo.setPassword(newPassword);
					}
					transaction.commit();
					isUpdated=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}//end of outer if
	manager.close();
	
		return isUpdated;
	}//end of update
	@Override
	public List<EmployeeInfo> getAllEmployees() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfo";
		Query query = manager.createQuery(jpql);
		List<EmployeeInfo> employeelist = query.getResultList();
		manager.close();
return employeelist;
	
}
}
