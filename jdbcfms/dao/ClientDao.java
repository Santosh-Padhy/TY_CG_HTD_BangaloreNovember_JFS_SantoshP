package com.capgemini.fms.dao;

import com.capgemini.fms.bean.Client;

public interface ClientDao {
public Client addClient(int clientid,String clientname);
public boolean removeClient(int clientid);//clientid primary key	
public Client getClientinfo(int clientid);	
}
