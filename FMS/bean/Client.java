package com.capg.fms.bean;

public class Client {
private int clientid;
private String clientname;
public int getClientid() {
	return clientid;
}
public void setClientid(int clientid) {
	this.clientid = clientid;
}
public String getClientname() {
	return clientname;
}
public void setClientname(String clientname) {
	this.clientname = clientname;
}
@Override
public String toString() {
	return "Client [clientid=" + clientid + ", clientname=" + clientname + "]";
}

}
