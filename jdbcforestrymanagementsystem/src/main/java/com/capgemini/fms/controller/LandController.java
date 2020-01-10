package com.capgemini.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.fms.validator.StreetAddValidation;
import com.capgemini.fms.bean.Customer;
import com.capgemini.fms.bean.Land;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.services.LandServices;
import com.capgemini.fms.services.LandServicesImpl;
import com.capgemini.forestmanagementsystem.util.Validator;

public class LandController {
	static Scanner scanner = new Scanner(System.in);
	static LandServices landservices = new LandServicesImpl();
	static Land land = FmsFactory.getLand();
	static Validator validation = new Validator();
	static List<Land> landlist=  new ArrayList<Land>();
	public static void land() {
		System.out.println("*****************************************");
		System.out.println("Welcome to Land Account");
		while (true) {
			System.out.println("1.Insert Land Data");
			System.out.println("2.Delete Land Data");
			System.out.println("3.Get Land Details");
			System.out.println("Enter Your Choices");
			int input = Integer.parseInt(scanner.next());


			boolean flag;
			switch(input) {
			case 1:
				flag=true;
				while(flag==true) {
					System.out.println("Enter ParcelId");
					Integer parcelId = validation.validateId((scanner.next()));
					if(parcelId!=null) {
						land.setParcelId(parcelId);
						flag=false;
					}else {
						System.out.println("Please Enter a Valid Id");
					}
				}
				flag=true;
				while(flag==true) {
					System.out.println("Enter ParcelLoaction");
					String parcelLocation= scanner.next();
					if(StreetAddValidation.validate(parcelLocation)) {
						land.setParcelLocation(parcelLocation);
						flag=false;
					}else {
						System.out.println("Enter a Valid Address");
					}
					Land landinput = landservices.addLand(land);//add exception
					if(landinput!=null) {
						System.out.println("Data inserted Successfully");
					}//inner if
					break;
				}	
				break;
			case 2:
				flag=true;
				while(flag==true) {
					System.out.println("Enter landId to Dlete the Land Data");
					Integer parcelid  = validation.validateId(scanner.next());
					if(parcelid!=null) {
						boolean  output=landservices.removeLand(parcelid);
						flag=false;
						if(output!=false) {
							System.out.println("data  deleted");
						}else {
							System.out.println("datanot deleted");
						}	
					}else {
						System.out.println("Enter a Vlaid ID");
					}
					break;
				}//end of second if
				break;
			case 3: 
				flag=true;
				while(flag==true) {
					System.out.println("Enter th parcel id to get the Details");
					Integer parcelid = validation.validateId(scanner.next());
					if(parcelid!=null) {
						landlist=landservices.getLand(parcelid);
						flag=false;
						for(Land landoutput:landlist) {
							System.out.println(landoutput);
						}//showing error
					}

				}
				break;


			}//end of while


		}//end of while
	}//end of class
}//end of class
