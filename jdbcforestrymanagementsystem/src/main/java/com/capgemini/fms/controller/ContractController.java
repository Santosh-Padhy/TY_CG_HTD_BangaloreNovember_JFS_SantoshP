package com.capgemini.fms.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.fms.validator.DateValidation;
import com.capg.fms.validator.DayValidation;
import com.capg.fms.validator.Validation;
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
	public static void contract() {
		System.out.println("*****************************************");
		System.out.println("       Welcome to Contract Account            ");
		System.out.println("*****************************************");
		int input=0;
		while (true) {
			System.out.println("1.Insert Contract Data");
			System.out.println("2.Delete Contract Data");
			System.out.println("3.Get Contract Details");
			System.out.println("4.Update Contract details");
			System.out.println("5.Go Back To Home Page");
			System.out.println("Enter Your Choices");
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.err.println(" Please Enter Your  Choice as Shown Below");
			}
			boolean flag;
			switch(input) {
				case 1:
					flag=true;
					while(flag==true) {
						System.out.println("Eneter ContractDetails");
						System.out.println("Enter Contractno");
						Integer contractno =Validation.validateId(scanner.next());
						if(contractno!=null) {
							contract.setContractno(contractno);
							flag=false;
						}
						else {
							System.err.println("Enter a Proper Id i.e in between 0-9");
						}
					}//end of 1st while
					flag=true;
					while(flag==true) {
						System.out.println("Enter Customerid");
						Integer customerid =Validation.validateId(scanner.next());
						if(customerid!=null) {
							contract.setCustomerid(customerid);
							flag=false;
						}
						else {
							System.err.println("Enter a Proper Id i.e in between 0-9");
						}
					}//end of 3rd while	
					flag=true;
					while(flag==true) {
						System.out.println("Enter Productid");
						Integer productid =Validation.validateId(scanner.next());
						if(productid!=null) {
							contract.setProductid(productid);
							flag=false;
						}
						else {
							System.err.println("Enter a Proper Number i.e in between 0-9");
						}
					}//end of 5rd while
					flag=true;
					while(flag==true) {
						System.out.println("Enter Haulierid");
						Integer haulierid=Validation.validateId(scanner.next());
						if(haulierid!=null) {
							contract.setHaulierid(haulierid);
							flag=false;
						}
						else {
							System.err.println("Enter a Proper Number i.e in between 0-9");
						}
					}//end of 5rd whil
					
//					flag=true;
//					while(flag==true) {
//						System.out.println("Enter Delivery Date");
//						try {
//							String date=scanner.next();
//							if (DateValidation.isValidDate(date)) {
//								contract.setDeliverydate(date);
//								flag=false;
//							}else{
//								System.err.println("Enter correct  Future Date DD/MM/YYYY");	
//							}
//
//						}catch(ParseException e) {
//
//							System.err.println("Enter correct  Future Date DD/MM/YYYY");
//						}
//					}//end of 6th while
					flag=true;
					while(flag==true) {
						System.out.println("Enter Delivery Day");
						String day=scanner.next();
						if (DayValidation.dayValidate(day)){
							contract.setDeliveryday(day);
							flag=false;
						} else {
							System.err.println("Enter Valid Day In Format Of (Mon-Sunday)");

						}
					}//end of while
					flag=true;
					while(flag==true) {
						System.out.println("Enter Quantity");
						Integer quantity =Validation.validateId(scanner.next());
						if(quantity!=null) {
							contract.setQuantity(quantity);
							flag=false;
						}
						else {
							System.err.println("Enter a Proper Number i.e in between 0-9");
						}
					}//end of 5rd while
					contract=contractservices.addContract(contract);
					if(contract!=null) {
						System.out.println("Data inserted Sucessfully");
						break;
					}
					else {
						System.out.println("Data insertion is failed");
					}
					break;
				case 2:
					flag=true;
					while(flag==true) {
						System.out.println("Enter Contractno to delete the data");
						Integer contractid = validation.validateId((scanner.next()));
						if(contractid!=null) 
							contract.setContractno(contractid);
						flag=false;
						boolean response=contractservices.removeContract(contractid);
						if(response!=false)
						{
							System.out.println("Data is Deleted");
							break;
						}

						else {
							System.out.println("Enter the Correct id ");

						}	
					}
					break;
				case 3:	
					flag = true;
					while(true){
						System.out.println("Enter Contractno");
						Integer contractno = validation.validateId(scanner.next());
						if(contractno!=null) {
							contract.setContractno(contractno );
							flag=false;
						}else {
							System.out.println("Enter the correct id");
						}
						contractlist=contractservices.getContract(contractno);
						for(Contract contract:contractlist) {
							System.out.println(contract);
					
						}
						break;
					}
	
				case 4:
					while(true){
						System.out.println("Enter ContractNo Update ");
						Integer contractno = validation.validateId(scanner.next());
						if(contractno!=null) {
							contract.setContractno(contractno);
							boolean response=contractservices.modifyContract(contract);
							if(response!=false) {
								System.out.println("Data updated Successfully");
							}
							break;
						}else {
							System.out.println("Enter the correct id");
						}
						break;
					}
				case 6:
					//go abckto home page
				}//end of switch
		}//end of while
	}//end of method
}//end of class


