package com.capg.fms.factory;

import com.capg.fms.bean.Contract;
import com.capg.fms.bean.Customer;
import com.capg.fms.bean.Product;
import com.capg.fms.bean.*;
import com.capg.fms.dao.AdminLoginDaoImpl;
import com.capg.fms.dao.ClientDaoImpl;
import com.capg.fms.dao.ForestDao;
import com.capg.fms.dao.ForestDaoImpl;

public class FmsFactory {
	public static Contract getContract() {
		return new Contract();
	}
	
	public static Customer getCustomer() {
		return new Customer();
	}
	public static Product getProduct() {
		return new Product();
	}
	public static ForestDaoImpl getForestDAOImpl() {
		return new ForestDaoImpl();
	}
	
	public static AdminLoginDaoImpl getAdminDaoImpl() {
		return new AdminLoginDaoImpl();
		
	}
	public static ClientDaoImpl getClientDaoImpl() {
	return new ClientDaoImpl();
	}
	public static Client getClient() {
		return new Client();
	}
	
	
	
}
