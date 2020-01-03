package com.capgemini.fms.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.capgemini.fms.bean.Contract;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.services.ContractServices;
import com.capgemini.fms.services.ContractServicesImpl;
import com.capgemini.forestmanagementsystem.util.Validator;
public class ContractController {
	static Scanner scanner = new Scanner(System.in);
	static ContractServices contractservices = new ContractServicesImpl();
	static Validator validation = new Validator();
	static Contract contract = FmsFactory.getContract();
	static List<Contract> contractlist=  new ArrayList<Contract>();
	public static void contractController() {
		System.out.println("*****************************************");
		System.out.println("       Welcome to Contract Account            ");
		System.out.println("*****************************************");
		int input=0;
		while (true) {
			System.out.println("1.Insert Contract Data");
			System.out.println("2.Delete Contract Data");
			System.out.println("3.Get Contract Details");
			System.out.println("4.Update Contract details");
			System.out.println("Enter Your Choices");
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.out.println(" Please Enter Your  Choice as Shown Below");
			}
			if (input == 1) {
				while(true) {
					System.out.println("Enter Contract No");
					int contractno = validation.validateId(scanner.next());
					contract.setContractno(contractno);
					System.out.println("Enter Customer Id");
					int customerid=validation.validateId(scanner.next());
					contract.setCustomerid(customerid);
					System.out.println("Enter Product Id");
					int productid=validation.validateId(scanner.next());
					contract.setProductid(productid);
					System.out.println("Enter Haulier Id");
					int haulierid=validation.validateId(scanner.next());
					contract.setHaulierid(haulierid);
					System.out.println("Enter the Date in dd-mm-yyyy");
					String date = scanner.next();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
					Date date2=null;
					try {
						//Parsing the String
						date2 = dateFormat.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					contract.setDeliverydate(date2);
					System.out.println("Enter the DeliveryDay");
					String day= scanner.next();
					contract.setDeliveryday(day);
					System.out.println("Enter the Quantity");
					int quantity = scanner.nextInt();
					contract.setQuantity(quantity);

					if(response!=false) {
						System.out.println("Data inserted Sucessfully");
						break;
					}
					else {
						System.out.println("Data insertion is failed");
					}
				}

			}






















		}//end of method

























	}
}//end of class
