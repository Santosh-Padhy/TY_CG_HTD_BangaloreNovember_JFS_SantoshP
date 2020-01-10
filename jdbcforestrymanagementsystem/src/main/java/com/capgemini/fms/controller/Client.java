package com.capgemini.fms.controller;

import java.util.Scanner;

public class Client {//client to  other implementation 
	static Scanner scanner = new Scanner (System.in);
	static int input;
	public static void clientController() {
		System.out.println("*****************************************");
		while (true) {
			System.out.println("*****************************************");
			System.out.println("Press 1 to do Contract Operation ");
			System.out.println("Press 2 to do Product Operation");
			System.out.println("*****************************************");
			System.out.print("Enter your choice :");
			input = Integer.parseInt(scanner.next());
			if (input == 1) {
				ContractController.contract();
			} 
			else if (input == 2) {
			ProductController.product();
			}
			
		}	

	}
















}//end of class
