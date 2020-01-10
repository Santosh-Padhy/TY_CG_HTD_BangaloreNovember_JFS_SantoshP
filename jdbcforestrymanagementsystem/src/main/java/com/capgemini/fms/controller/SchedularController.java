package com.capgemini.fms.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.Schedular;
import com.capgemini.fms.exception.CustomException;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.services.SchedularServices;
import com.capgemini.fms.services.SchedularServicesImpl;
import com.capgemini.forestmanagementsystem.util.DateValidation;
import com.capgemini.forestmanagementsystem.util.Validator;

public class SchedularController {
	static Scanner scanner = new Scanner(System.in);
	static SchedularServices schedularservices = new SchedularServicesImpl();
	static Schedular schedularbean = FmsFactory.getSchedular();
	static Validator validation = new Validator();
	static List<Schedular> list =  new ArrayList();
	public static  void main(String[]args){     //c
		System.out.println("*****************************************");
		System.out.println("       Welcome to Schedular Account            ");
		System.out.println("*****************************************");
		int input=0;
		while (true) {
			System.out.println("1.Insert Data");
			System.out.println("2.Delete Schedular Data");
			System.out.println("3.Get Schedular Details");
			System.out.println("Enter Your Choices");
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.out.println(" Please Enter Your  Choice as Shown Below");
			}
			boolean flag;
			switch(input) {
			case 1:
				flag=true;
				while(flag==true){
					System.out.println("Enter Schedular Id");
					Integer schedularid = validation.validateId(scanner.next());
					if(schedularid!=null) {
						schedularbean.setSchedularid(schedularid);
						flag=false;
					}
					else {
						System.out.println("Enter the Schedular Id");

					}
				}
				flag=true;
				while(flag==true) {
					System.out.println("Enter Product id");
					Integer productid = validation.validateId(scanner.next());
					if(productid!=null) {
						schedularbean.setProductid(productid);
						flag=false;
					}
					else {
						System.out.println("Enter the Product id");
					}
				}	

				flag=true;
				while(flag==true) {
					System.out.println("Enter the Date");
					String date=scanner.next();
					try {
						if(DateValidation.isValidDate(date)) {
							schedularbean.setDate(date);
							flag=false;
						}else {
							System.out.println("Enter the Date in dd//mm/yyyy");
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				flag=true;
				while(flag==true) {
					System.out.println("Enter the quantity");
					Integer quantity = validation.validateId(scanner.next()); 
					if(quantity!=null) {
						schedularbean.setQuantity(quantity);
						flag=false;
					}else {
						System.out.println("Enter the quantity");
					}
				}
				boolean response =schedularservices.addData(schedularbean);//add exception
				if(response!=false) {
					System.out.println("Data inserted");
				}else {
					System.out.println("Data is not inserted");
				}
				break;
			case 2:
				flag=true;
				while(flag==true) {
					System.out.println("Enter SchedularId To delete");
					Integer schedularid = validation.validateId((scanner.next()));
					if(schedularid!=null) {
						schedularbean.setSchedularid(schedularid);
						flag=false;
					}
					else {
						System.out.println("Enter the Correct id ");
					}

					boolean output=schedularservices.removeData(schedularid);
					if(output!=false)
					{
						System.out.println("Data is Deleted");
						break;
					}	
				}	
				break;
			case 3: 
				flag=true;
				while(flag==true) {
					System.out.println("Enter SchedularId To delete");
					Integer schedularid = validation.validateId((scanner.next()));
					if(schedularid!=null) {
						schedularbean.setSchedularid(schedularid);
						flag=false;
					}else
					{
						System.out.println("enter the id");
					}
					list=schedularservices.getAllData(schedularid);
					for(Schedular schedular:list) {
						System.out.println(schedular);
					}
				}
			}


		}
	}
}
