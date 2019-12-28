package com.capgemini.fms.bean;

public class Client {
private int clientid;

public int getClientid() {
	return clientid;
}
public void setClientid(int clientid) {
	this.clientid = clientid;
}
private String clientname;	
public void setClientname(String clientname) {
	this.clientname=clientname;
}
public String getClientname() {
	return clientname;
}
@Override
public String toString() {
	return "Client [clientid=" + clientid + ", clientname=" + clientname + "]";
}	
}
