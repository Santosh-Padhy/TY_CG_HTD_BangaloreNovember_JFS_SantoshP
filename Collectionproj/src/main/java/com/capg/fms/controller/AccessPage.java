package com.capg.fms.controller;

import java.util.Scanner;

import com.capg.fms.exception.LoginFailedException;
import com.capg.fms.validator.Validation;
   
public class AccessPage {
	static Scanner scanner = new Scanner(System.in);
	static Validation validation = new Validation();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------Welcome To Forestry Management System------------------------------------");
		while(true) {
			System.out.println("1.Login as admin");
			System.out.println("2.Login as Client");
			int outcome=sc.nextInt();
			switch (outcome) {
			case 1:
				boolean adminloginoutput=  Admin.admin();
				if(adminloginoutput==false)
				break;
				System.out.println("1.CONTRACT DETAILS");
				System.out.println("2.CUSTOMER DETAILS");
				System.out.println("3.PRODUCT  DETAILS");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("---------------WELCOME TO CONTRACT-------------");
					System.out.println("================================================================");
					ContractImplementation.contract();
					break;
				case 2:
					System.out.println("---------------WELCOME TO CUSTOMER-------------");
					System.out.println("================================================================");
					CustomerImplementation.customer();
					break;
				case 3:
					System.out.println("---------------WELCOME TO PRODUCT-------------");
					System.out.println("=================================================================");
					ProductImplementation.product();
					break;
				default :
					System.err.println("Something went wrong...");
					break;
				}
			case 2:
				ClientImplementation.client();
				}	
			}	
		}
	}
