package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.Customer;

public interface CustomerDao {
public Customer addCustomer(Customer customer);
public boolean removeCustomer(int customerid);
public List<Customer> getCustomerinfo(int customerid);
public 	boolean modifyCustomer(Customer customer);	
}
