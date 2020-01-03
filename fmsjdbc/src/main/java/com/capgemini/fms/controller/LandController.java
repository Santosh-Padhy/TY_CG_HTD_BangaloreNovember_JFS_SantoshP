package com.capgemini.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("Welcome to Land Account");
		while (true) {
			System.out.println("1.Insert Land Data");
			System.out.println("2.Delete Land Data");
			System.out.println("3.Get Land Details");
			System.out.println("4.Update Land Data");
			System.out.println("Enter Your Choices");
			int input = Integer.parseInt(scanner.next());
			if (input == 1) {
				System.out.println("Enter ParcelId");
				long parcelId = validation.validateId((scanner.next()));
				land.setParcelId(parcelId);
				System.out.println("Enter ParcelLoaction");
				String parcelLocation= scanner.next();
				land.setParcelLocation(parcelLocation);
				Land landinput = landservices.addLand(land);
				if(landinput!=null) {
					System.out.println("Data inserted Successfully");
				}//inner if
			}else if(input==2) {
				System.out.println("Enter landId to Dlete the Land Data");
				int parcelid  = scanner.nextInt();
				boolean  output=landservices.removeLand(parcelid);
				if(output!=false) {
					System.out.println("data  deleted");
				}else {
					System.out.println("datanot deleted");
				}	
			}//end of second if
			else if(input==3) {
				System.out.println("Enter th parcel id to get the Details");
				long parcelid = validation.validateId(scanner.next());
				landlist=landservices.getLand(parcelid);
				for(Land landoutput:landlist) {
					System.out.println(landoutput);
				}//showing error
			}//3rd if
			else if(input==4) {
				System.out.println("Enter the parcelid to ");
			}



		}//end of while

























	}//end of main	






























}//end of class
