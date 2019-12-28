package com.capg.fms.dao;

import java.util.LinkedHashMap;

import com.capg.fms.bean.Contract;
import com.capg.fms.bean.Customer;
import com.capg.fms.bean.Product;

public interface ForestDao {
	public LinkedHashMap<Integer,Contract> addTheContract(Contract contractbean,int contractno);
	public LinkedHashMap<Integer,Customer> addTheCustomer(Customer customerbean);
	public LinkedHashMap<Integer,Product> addTheProduct(Product productbean);

}
