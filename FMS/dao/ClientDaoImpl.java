package com.capg.fms.dao;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.capg.fms.bean.Client;
import com.capg.fms.bean.Contract;

public class ClientDaoImpl implements ClientDao{
	Scanner scn= new Scanner(System.in);
	LinkedHashMap<Integer, Client> client=new LinkedHashMap<Integer, Client>();
	public LinkedHashMap<Integer, Client> addclient(Client clientbean, int id) {
		client.put(id, clientbean);
		return client;
	}

	public LinkedHashMap<Integer, Client> removeClient(int id) {
		client.remove(id);
		return null;
	}

	public LinkedHashMap<Integer, Client> showClientDetails(Client clientbean, int id) {
		Collection<Client> clientdata=client.values();
		
		return client;//doubt
} 
}