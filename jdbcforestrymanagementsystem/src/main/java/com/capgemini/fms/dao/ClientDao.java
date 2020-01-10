package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.Client;

public interface ClientDao {
public boolean addClient(int clientid,String clientname);
public boolean removeClient(int clientid);//clientid primary key	
public List<Client> getClientinfo(int clientid);
}
