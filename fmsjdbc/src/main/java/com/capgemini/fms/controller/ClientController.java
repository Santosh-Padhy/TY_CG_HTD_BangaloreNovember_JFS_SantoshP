package com.capgemini.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	public static  void main(String[] args){
		System.out.println("*****************************************");
		System.out.println("       Welcome to Client Account            ");
		System.out.println("*****************************************");
		int input=0;
		while (true) {
			System.out.println("1.Insert Client Data");
			System.out.println("2.Delete Client Data");
			System.out.println("3.Get Client Details");
			System.out.println("Enter Your Choices");
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.out.println(" Please Enter Your  Choice as Shown Below");
			}
			if (input == 1) {
				while(true) {
					System.out.println("Enter ClientId");
					int clientid = scanner.nextInt();
					clientbean.setClientid(clientid);
					System.out.println("Enter Client Name");
					String clientname= scanner.next();
					clientbean.setClientname(clientname);
					boolean response=clientservices.addClient(clientid, clientname);
					if(response!=false) {
						System.out.println("Data inserted Sucessfully");
						break;
					}
					else {
						System.out.println("Data insertion is failed");
					}
				}

			}
			else if(input==2) {
				while(true) {
					System.out.println("Enter ClientId");
					Integer clientid = validation.validateId((scanner.next()));
					if(clientid!=null) {
						clientbean.setClientid(clientid);
						boolean response=clientservices.removeClient(clientid);
						if(response!=false)
						{
							System.out.println("Data is Deleted");
							break;
						}
					}
					else {
						System.out.println("Enter the Correct id ");
					}
					
					}

			}else if(input==3) {
				while(true){
					System.out.println("Enter ClientId");
					Integer clientid = validation.validateId(scanner.next());
					if(clientid!=null) {
						clientbean.setClientid(clientid);
					}else {
						System.out.println("Enter the correct id");
					}
					list=clientservices.getClientinfo(clientid);
					for(Client client:list) {
						System.out.println(client);
					}
				}			}
		}//end of method

		//end of class
	}
}







