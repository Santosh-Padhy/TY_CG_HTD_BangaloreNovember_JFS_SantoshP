package com.capg.fms.controller;

import java.util.Scanner;

import com.capg.fms.dao.AdminLoginDao;
import com.capg.fms.dao.AdminLoginDaoImpl;
import com.capg.fms.exception.LoginFailedException;
import com.capg.fms.factory.FmsFactory;

public class Admin {


public static boolean admin() {
	AdminLoginDao admindao =FmsFactory.getAdminDaoImpl();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Username");
	String username = sc.next();
	System.out.println("Enter Password");
	String password = sc.next();
try {
	boolean b1=admindao.adminLogin(username, password);
	if(b1!=false) {
return true;
	}
}catch(LoginFailedException e) {	
}
System.out.println("Login failed");
return false;
}
}