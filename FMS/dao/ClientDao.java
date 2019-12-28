package com.capg.fms.dao;

import java.util.LinkedHashMap;

import com.capg.fms.bean.Client;

public interface ClientDao {
public LinkedHashMap<Integer,Client> addclient(Client clientbean,int id);
public LinkedHashMap<Integer,Client> removeClient(int id);
public LinkedHashMap<Integer,Client> showClientDetails(Client clientbean,int id);
}
