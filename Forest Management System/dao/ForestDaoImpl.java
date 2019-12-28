package com.capg.fms.dao;

import java.util.LinkedHashMap;
import java.util.Scanner;

import com.capg.fms.bean.Contract;
import com.capg.fms.bean.Customer;
import com.capg.fms.bean.Product;

public class ForestDaoImpl implements ForestDao {

	LinkedHashMap<Integer, Contract> contract=new LinkedHashMap<Integer, Contract>();
	LinkedHashMap<Integer, Customer> customer=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Product> product=new LinkedHashMap<Integer, Product>();
	Scanner sc=new Scanner(System.in);

	public LinkedHashMap<Integer, Contract> addTheContract(Contract contractbean, int contractno) {
		contract.put(contractno, contractbean);
		return contract;
	}

	public LinkedHashMap<Integer, Customer> addTheCustomer(Customer customerbean) {
		
		System.out.println("Enter customer id:");
		int customerno=sc.nextInt();
		customer.put(customerno, customerbean);
		return customer;
	
	}

	public LinkedHashMap<Integer, Product> addTheProduct(Product productbean) {
		System.out.println("Enter ProductID number:");
		
		int productno=sc.nextInt();
		product.put(productno,productbean);
		return product;	
		
		
		
		
	
	}

}
