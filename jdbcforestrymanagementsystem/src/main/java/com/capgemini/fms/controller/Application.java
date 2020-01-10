package com.capgemini.fms.controller;

import java.util.Scanner;

public class Application {
	static Scanner scanner = new Scanner (System.in);
	static int input;
	public static void main(String[] args) {

		System.out.println("*****************************************");
		while (true) {
			System.out.println("*****************************************");
			System.out.println("Press 1 Login As Admin");
			System.out.println("Press 2 Login As Client");
			System.out.println("Press 3 to Go Back to Home Page");
			System.out.println("*****************************************");
			System.out.print("Enter your choice :");
			input = Integer.parseInt(scanner.next());
			if (input == 1) {
			AdminAccess.adminController();
			} 
			else if (input == 2) {
			Client.clientController();
			}else if(input==3) {
				Application.main(args);
			}
			
		}//end of while
		
	}//end of method

}//end of application
