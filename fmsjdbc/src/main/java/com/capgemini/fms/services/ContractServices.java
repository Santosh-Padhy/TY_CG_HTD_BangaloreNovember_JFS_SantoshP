package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Contract;

public interface ContractServices {
	public Contract addContract(Contract contract);
	public boolean removeContract(int contractno);//clientid primary key	
	public List<Contract> getContract(int crontactno);
	public boolean modifyContract(Contract contract);
}
