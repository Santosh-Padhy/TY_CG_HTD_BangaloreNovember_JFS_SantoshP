package com.capgemini.fms.factory;

import com.capgemini.fms.bean.Client;
import com.capgemini.fms.bean.Contract;
import com.capgemini.fms.bean.Customer;
import com.capgemini.fms.bean.Land;
import com.capgemini.fms.bean.Product;
import com.capgemini.fms.dao.ClientDao;
import com.capgemini.fms.dao.ClientDaoImpl;
import com.capgemini.fms.dao.ContractDao;
import com.capgemini.fms.dao.ContractDaoImpl;
import com.capgemini.fms.dao.CustomerDao;
import com.capgemini.fms.dao.CustomerDaoImpl;
import com.capgemini.fms.dao.LandDao;
import com.capgemini.fms.dao.LandDaoImpl;
import com.capgemini.fms.dao.ProductDao;
import com.capgemini.fms.dao.ProductDaoImpl;

public class FmsFactory {
	public static Contract getContract() {
		return new Contract();
	}
	public static Client getClient() {
		return new Client();
	}
	public static Customer getCustomer() {
		return new Customer();	 
	}
	public static Product getProduct() {
		return new Product();
	}
	public static Land getLand() {
		return new Land();
	}

}
