package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Customer;
import com.capgemini.fms.dao.CustomerDao;
import com.capgemini.fms.factory.CustomerFactory;
import com.capgemini.fms.factory.FmsFactory;

public class CustomerServicesImpl implements CustomerServices{
CustomerDao customerdao = CustomerFactory.instanceOfCustomerDaoImpl();
	
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerdao.addCustomer(customer);
	}

	public boolean removeCustomer(int customerid) {
		// TODO Auto-generated method stub
		return customerdao.removeCustomer(customerid);
	}

	public List<Customer> getCustomerinfo(int customerid) {
		// TODO Auto-generated method stub
		return customerdao.getCustomerinfo(customerid);
	}

	public boolean modifyCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerdao.modifyCustomer(customer);
	}

}
