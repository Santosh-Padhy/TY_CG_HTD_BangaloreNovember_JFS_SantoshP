package com.capgemini.fms.factory;

import com.capgemini.fms.dao.ClientDao;
import com.capgemini.fms.dao.ClientDaoImpl;
import com.capgemini.fms.services.ClientServiceImpl;
import com.capgemini.fms.services.ClientServices;

public class ClientFactory {
	public static ClientDao instanceOfClientDaoImpl() {
		ClientDao clientdao  = new ClientDaoImpl();
		return  clientdao;
	}
	public static ClientServices instanceOfClientServiceImpl() {
		ClientServices clientservices = new ClientServiceImpl();
		return clientservices;
		
	}
	
	
	
	
	
}
