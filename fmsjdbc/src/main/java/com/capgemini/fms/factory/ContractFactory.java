package com.capgemini.fms.factory;

import com.capgemini.fms.dao.ContractDao;
import com.capgemini.fms.dao.ContractDaoImpl;
import com.capgemini.fms.services.ContractServices;
import com.capgemini.fms.services.ContractServicesImpl;

public class ContractFactory {
public static ContractDao instanceOfContractDaoImpl() {
	ContractDao contractdao = new ContractDaoImpl();
	return contractdao;
	
}//end of method

public static ContractServices instanceOfContractServicesImpl() {
	ContractServices contractservices = new ContractServicesImpl();
	return contractservices;
}
}
