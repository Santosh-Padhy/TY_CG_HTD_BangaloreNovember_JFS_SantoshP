package com.capgemini.fms.services;

import com.capgemini.fms.bean.Client;

public interface ClientServices {
	public interface ClientDao {
	public boolean addClient(int clientid,String clientname);
	public boolean removeClient(int clientid);//clientid primary key	
	public Client getClientinfo(int clientid);
	}
}