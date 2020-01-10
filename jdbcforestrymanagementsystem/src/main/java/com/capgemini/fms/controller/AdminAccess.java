package com.capgemini.fms.controller;

import java.util.Scanner;

public class AdminAccess {
	static Scanner scanner  = new Scanner(System.in);
	 static int input;
public static void adminController() {
	while(true) {
	System.out.println("**********Welcome to Admin Acoount***************");
	System.out.println("Please Enter the username");
	 String username = scanner.next();
	 System.out.println("Please enter the Password");
	 String password = scanner.next();
	
	System.out.println("*****************************************");
	while (true) {
		System.out.println("*****************************************");
		System.out.println("Press 1 to do Client Operation");
		System.out.println("Press 2 to do Customer Operation");
		System.out.println("Press 3 to do Land Operation");
		System.out.println("*****************************************");
		System.out.print("Enter your choice :");
	 input = Integer.parseInt(scanner.next());
		if (input == 1) {
				ClientController.client();
			} 
		 else if (input == 2) {
			 CustomerController.customer();
		}
		 else if(input==3) {
			 LandController.land();
		 }
	}	
	
}//end of method
}//end of class
}