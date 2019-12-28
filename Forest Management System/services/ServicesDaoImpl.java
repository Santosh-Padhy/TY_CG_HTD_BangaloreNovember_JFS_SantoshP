package com.capg.fms.services;

import java.util.LinkedHashMap;

import com.capg.fms.bean.Contract;
import com.capg.fms.bean.Customer;
import com.capg.fms.bean.Product;
import com.capg.fms.dao.ForestDao;
import com.capg.fms.factory.FmsFactory;

public class ServicesDaoImpl implements ServicesDao {
ForestDao dao = FmsFactory.getForestDAOImpl();

	public LinkedHashMap<Integer, Contract> addTheContract(Contract contractbean,int contractno) {
		
		return dao.addTheContract(contractbean,contractno);
	}

	public LinkedHashMap<Integer, Customer> addTheCustomer(Customer customerbean) {
		// TODO Auto-generated method stub
		return dao.addTheCustomer(customerbean);
	}

	public LinkedHashMap<Integer, Product> addTheProduct(Product productbean) {
		// TODO Auto-generated method stub
		return dao.addTheProduct(productbean);
	}

}
