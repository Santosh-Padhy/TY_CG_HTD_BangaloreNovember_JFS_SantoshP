package com.capg.fms.dao;

public class AdminLoginDaoImpl implements AdminLoginDao {
String username = "Root";
String password  ="qwerty";
	public boolean adminLogin(String username, String password) {
		
		if(username.equals("Root")&&password.equals("qwerty"))
		{
	return true;
	
	}
 return false;
}
}