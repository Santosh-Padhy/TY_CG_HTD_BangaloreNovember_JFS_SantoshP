package com.capg.fms.controller;

import java.util.Scanner;

import com.capg.fms.dao.ClientLoginDao;
import com.capg.fms.exception.LoginFailedException;
import com.capg.fms.factory.FmsFactory;

public class ClientLogin {
public static boolean client() {
ClientLoginDao clintlogindao = FmsFactory.getClientLoginDaoImpl();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Username");
String username = sc.next();
System.out.println("Enter Password");
String password = sc.next();
try {
	boolean b1=clintlogindao.clientLogin(username, password);
	if(b1!=false) {
return true;
	}
}catch(LoginFailedException e) {	
}
System.out.println("Login failed Please try again");
return false;
}
	
	
	
	
	
	
	
	
	
}//end of method
//end of class
