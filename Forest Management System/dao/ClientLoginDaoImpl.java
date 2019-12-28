package com.capg.fms.dao;

public class ClientLoginDaoImpl implements ClientLoginDao{
	String username = "Root";
	String password  ="qwerty";
	public boolean clientLogin(String username, String password) {
		
		
		if(username.equals(username)&&password.equals(password)) {
		return true;
	}//end of if
return false;
}//end of method
}//end of class