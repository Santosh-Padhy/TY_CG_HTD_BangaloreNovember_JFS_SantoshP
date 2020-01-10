package com.capgemini.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.fms.validator.NameValidation;
import com.capgemini.fms.bean.Client;
import com.capgemini.fms.exception.CustomException;
import com.capgemini.fms.services.ClientServiceImpl;
import com.capgemini.forestmanagementsystem.util.Validator;

public class ClientController {
	static Scanner scanner = new Scanner(System.in);
	static ClientServiceImpl clientservices = new ClientServiceImpl();
	static com.capgemini.fms.bean.Client clientbean =com.capgemini.fms.factory.FmsFactory.getClient();
	static Validator validation = new Validator();
	static List<Client> list =  new ArrayList();
	public static  void client(){     //c
		System.out.println("*****************************************");
		System.out.println("       Welcome to Client Account            ");
		System.out.println("*****************************************");
		boolean flag;
		int input=0;
		while (true) {
			System.out.println("1.Insert Client Data");
			System.out.println("2.Delete Client Data");
			System.out.println("3.Get Client Details");
			System.out.println("4.Go Back To Home Page");
			System.out.println("Enter Your Choices");
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.out.println(" Please Enter Your  Choice as Shown Below");
			}

			switch(input) {
			case 1:
				Integer clientid;
				String clientname = null;
				while(true) {
					System.out.println("Enter ClientId");
					clientid =validation.validateId(scanner.next());
					if(clientid!=null) {
						clientbean.setClientid(clientid);
						break;
					}
					else {
						System.err.println("Enter a Proper Id i.e in between 0-9");
					}
				}
				while(true) {
					System.out.println("Enter Client Name");
					clientname = scanner.next();
					boolean output = NameValidation.validate(clientname);
					if(output!=false){
						clientbean.setClientname(clientname);
						break;
					}
					else {
						System.out.println("Please enter a valid name");
					}
				}

				try {
					boolean response=clientservices.addClient(clientid, clientname);
					if(response!=false) {
						System.out.println("Data inserted Sucessfully");
					}}catch(CustomException e) {
						System.out.println("Data is not inserted");
					}
					break;
				
				

			case 2:
				while(true) {
					System.out.println("Enter ClientId");
					clientid = validation.validateId((scanner.next()));
					if(clientid!=null) {
						clientbean.setClientid(clientid);
						boolean response1=clientservices.removeClient(clientid);
						if(response1!=false)
						{
							System.out.println("Data is Deleted");
							break;
						}
					}
					else {
						System.out.println("Enter the Correct id ");
					}

				}
				break;
			case 3:
				while(true){
					System.out.println("Enter ClientId");
					clientid = validation.validateId(scanner.next());
					if(clientid!=null) {
						clientbean.setClientid(clientid);
						list=clientservices.getClientinfo(clientid);
						for(Client client:list) {
							System.out.println(client);
						}
						break;
					}else {
						System.out.println("Enter the correct id");
					}



				}

			}


		}				
	}


}//end of method