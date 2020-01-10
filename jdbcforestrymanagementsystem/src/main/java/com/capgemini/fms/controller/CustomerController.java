package com.capgemini.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.Customer;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.services.ClientServiceImpl;
import com.capgemini.fms.services.CustomerServices;
import com.capgemini.fms.services.CustomerServicesImpl;
import com.capgemini.forestmanagementsystem.util.Validator;

public class CustomerController {
	static Scanner scanner = new Scanner(System.in);
	static CustomerServices customerservices = new CustomerServicesImpl();
	static Validator validation = new Validator();
	static Customer customer = FmsFactory.getCustomer();
	static List<Customer> customerlist=  new ArrayList<Customer>();
	public static void customer() {
		int input=0;
		System.out.println("*****************************************");
		System.out.println("Welcome to Client Account");
		System.out.println("******************************************");
		while (true) {
			System.out.println("1.Insert Customer Data");
			System.out.println("2.Delete Customer Data");
			System.out.println("3.Get Customer Details");
			System.out.println("4.Update Customer Data");
			System.out.println("Enter Your Choices");
			
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.out.println(" Please Enter Your  Choice as Shown Below");
			}
			if (input == 1) {
				System.out.println("Enter CustomerId");
				int customerid = validation.validateId((scanner.next()));
				customer.setCustomerid(customerid);
				System.out.println("Enter CustomerName");
				String customername= scanner.next();
				customer.setCustomerName(customername);
				System.out.println("Enter the PrimaryAddress");
				String address1 = scanner.next();
				customer.setStreetAddress1(address1);
				System.out.println("Enter the Secondary Address");
				String address2 = scanner.next();
				customer.setStreetAddress2(address2);
				System.out.println("Enter the Postalcode");
				int postalCode = scanner.nextInt();
				customer.setPostalCode(postalCode);
				System.out.println("Enter the Telephonenumber");
				long phnno = validation.validateContact(scanner.next());
				if(phnno!=0) {
				customer.setTelephoneNumber(phnno);}
				else {
					System.out.println("Enter a 10 digit Phn No");
				}
				System.out.println("Enter the EmailId");
				String email=validation.validateEmail(scanner.next());
				if(email!=null) {
					customer.setEmail(email);
				}else {
					System.out.println("Enter the emaildId");
				}
				System.out.println("Enter the Cityname");
				String town = scanner.next();
				customer.setTown(town);
				Customer customerinput=customerservices.addCustomer(customer) ; 
				if(customerinput!=null) {
					System.out.println("Data inserted");
				}//innner if			
			}else if(input==2) {
				while(true) {
				System.out.println("Enter customerid to delete the data");
				Integer id  = validation.validateId(scanner.next());
				if(id!=null) {
					customer.setCustomerid(id);
				}else {
					System.out.println("Enter a correct id");
				}
				boolean  output=customerservices.removeCustomer(id);
				if(output!=false) {
					System.out.println("data  deleted");
					break;
				}
				
				else {
					System.err.println("Enter the Correct id ");
				}
				}}//end of second if
			else if(input==3) {
				System.out.println("Enter Customerid to Get The Details");
				int customerid = validation.validateId(scanner.next());
				customerlist=customerservices.getCustomerinfo(customerid);
				for(Customer customeroutput:customerlist) {
					System.out.println(customeroutput);
				}//showing error

			}//end of 3rd if
			else if(input==4) {
				while(true) {
				System.out.println("Enter Customerid to Update the CustomerDetails");
				Integer id = validation.validateId(scanner.next());
	            if(id!=null) {
	            	customer.setCustomerid(id);
	            	customerservices.modifyCustomer(customer);
	            	break;
	            }else {
	            	System.out.println("Enter a valid number");
	            }  }
				  
			}
		}

	}	//end of method
}//end of class
