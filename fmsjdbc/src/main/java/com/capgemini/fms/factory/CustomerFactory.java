package com.capgemini.fms.factory;

import com.capgemini.fms.dao.CustomerDao;
import com.capgemini.fms.dao.CustomerDaoImpl;
import com.capgemini.fms.services.CustomerServices;
import com.capgemini.fms.services.CustomerServicesImpl;

public class CustomerFactory {
public static CustomerDao instanceOfCustomerDaoImpl() {
	CustomerDao customerdao = new CustomerDaoImpl();
	return customerdao;
}//end of method

public static CustomerServices instanceOfCustomerServicesImpl() {
	CustomerServices customerservices = new CustomerServicesImpl();
	return customerservices;
}
}
