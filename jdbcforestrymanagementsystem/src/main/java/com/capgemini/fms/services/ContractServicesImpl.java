package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Contract;
import com.capgemini.fms.dao.ContractDao;
import com.capgemini.fms.factory.ContractFactory;
import com.capgemini.fms.factory.FmsFactory;

public class ContractServicesImpl implements ContractServices{
	ContractDao contractdao = ContractFactory.instanceOfContractDaoImpl();

	public Contract addContract(Contract contract) {
		
		return contractdao.addContract(contract);
	}

	public boolean removeContract(int contractno) {
	
		return contractdao.removeContract(contractno);
	}

	public List<Contract> getContract(int crontactno) {
		// TODO Auto-generated method stub
		return contractdao.getContract(crontactno);
	}

	public boolean modifyContract(Contract contract) {
		// TODO Auto-generated method stub
		return contractdao.modifyContract(contract);
	}

}
