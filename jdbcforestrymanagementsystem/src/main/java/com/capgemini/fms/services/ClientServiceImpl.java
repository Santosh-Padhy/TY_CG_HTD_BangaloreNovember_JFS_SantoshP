package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Client;
import com.capgemini.fms.factory.ClientFactory;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.dao.*;;
public class ClientServiceImpl implements ClientServices{
	
	
com.capgemini.fms.dao.ClientDao clientdao = ClientFactory.instanceOfClientDaoImpl();

public boolean addClient(int clientid,String clientname) {
	
	return clientdao.addClient(clientid, clientname);
}
public boolean removeClient(int clientid) {
	return clientdao.removeClient(clientid);
}
public List<Client> getClientinfo(int clientid) {
	return clientdao.getClientinfo(clientid);
}
	
}
