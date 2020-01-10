package com.capgemini.fms.bean;

public class Client {
private int clientid;
private String username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
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
	return "Client [clientid=" + clientid + ", username=" + username + ", password=" + password + ", clientname="
			+ clientname + "]";
}	
}
