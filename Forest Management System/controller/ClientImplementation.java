package com.capg.fms.controller;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capg.fms.bean.Client;
import com.capg.fms.bean.Contract;
import com.capg.fms.bean.Product;
import com.capg.fms.dao.ClientDao;
import com.capg.fms.factory.FmsFactory;
import com.capg.fms.exception.*;
public class ClientImplementation {
	public static void client(String[] st) {

		Scanner sc=new Scanner(System.in);
		ClientDao cd=FmsFactory.getClientDaoImpl();
		LinkedHashMap<Integer, Client> output=null;
		LinkedHashMap<Integer, Contract> response=null;
		LinkedHashMap<Integer, Product> presponse=null;
		while (true) {
			Client clientbean=FmsFactory.getClient();
			System.out.println("1.Insert Client Data");
			System.out.println("2.Delete Client Data");
			System.out.println("3.Get Client Details");
			System.out.println("4.Get Contract Details");
			System.out.println("5.Get Product Details");
			System.out.println("6.HOME");
		
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter client id:");
				clientbean.setClientid(sc.nextInt()) ;
				int id= clientbean.getClientid();
				System.out.println("Client Name");
				clientbean.setClientname(sc.next());
				output=cd.addclient(clientbean, id);
				if(response!=null) {
					System.out.println("Data Inserted Successfully");
				}else {
					try {
						cd.addclient(clientbean, id);
					}catch(DataSetException e) {
						System.out.println("Data is notr inserted");
					}
				}//end of else 
				break;
			case 2:
				System.out.println("Enter Client id to delete the ClientData");
				int clientid= sc.nextInt();
				output.remove(clientid);// check whether its correct id or not add exception
				break;
			case 3:
				System.out.println("Enter Client id to fetch the Data");
				int searchid = sc.nextInt();
				cd.showClientDetails(clientbean, searchid);//check id is present or not
				break;
			case 4:
				System.out.println("Enter contracrt id to find");
				int detail=sc.nextInt();
				boolean b1=response.containsKey(detail);
				if(b1==true) {
					System.out.println("-----------Contract Details---------");
					System.out.println("*************************************");
					System.out.println("THE CONTRACT DETAILS ARE:"+detail);
					Collection<Contract> c1=response.values();
					for (Contract contract : c1) {
						System.out.println(contract);
					}
				}else {
					throw new CustomerIdNotFoundException("No such id found");
				  }
				break;
			case 5:
				if(presponse!=null) {
					Set<Map.Entry<Integer, Product>> s1=presponse.entrySet();
					System.out.println("--------------------THE PRODUCT DETAILS ARE---------------");
					System.out.println("************************************************************");
					for (Map.Entry<Integer, Product> entry : s1) {
						System.out.println("THE PRODUCT NUMBER IS : "+entry.getKey());
						System.out.println(entry.getValue());
					}}
				break;
				
			case 6:
				AccessPage.main(st);
				
				
				
				
				































			}
		}
	}
}
