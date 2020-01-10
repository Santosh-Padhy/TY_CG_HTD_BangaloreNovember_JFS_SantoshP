package com.capgemini.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.Product;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.services.ProductServices;
import com.capgemini.fms.services.ProductServicesImpl;
import com.capgemini.forestmanagementsystem.util.Validator;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

public class ProductController {
	static Scanner scanner = new Scanner(System.in);
	static ProductServices productservices = new ProductServicesImpl();
	static Validator validation = new Validator();
	static Product product = FmsFactory.getProduct();
	static List<Product> productlist=  new ArrayList<Product>();
	public static void product() {
		int input=0;
		Integer productId=0;
		System.out.println("*****************************************");
		System.out.println("Welcome to Product Account");
		System.out.println("******************************************");
		while (true) {
			System.out.println("1.Insert Product Data");
			System.out.println("2.Delete Product Data");
			System.out.println("3.Get All Product  Details");
			System.out.println("Enter Your Choices");
			try{
				input = Integer.parseInt(scanner.next());
			} catch(NumberFormatException ex)
			{
				System.err.println("Please Enter Your  Choice as Shown Below");
			}
			if (input == 1) {
				System.out.println("Enter ProductId");
				 productId = validation.validateId((scanner.next()));
				if(productId!=0) 
				product.setProductId(productId);
				System.out.println("Enter ProductName");
				String productName= scanner.next();
				product.setProductName(productName);
				product=productservices.addProduct(product);
				if(product!=null) {
					System.out.println("Data inserted");
				}else {
					System.out.println("Data insertion is failed");
				}
			}else if(input==2) {
				while(true) {
					System.out.println("Enter Product id to Delete the Data");
					 productId = validation.validateId((scanner.next()));
					if(productId!=null) {
						product.setProductId(productId);
						boolean productresponse=productservices.removeProduct(productId);
						if(productresponse!=false) {
							System.out.println("Data is deleted");
							break;
						}else {
							System.out.println("Data is not deleted");
						}
						
					}

				}
			}else if(input==3) {
				while(true) {
					System.out.println("Enter Product id to Get the Details");
					 productId = validation.validateId((scanner.next()));
					if(productId!=null) {
						product.setProductId(productId);
						productlist=productservices.getAllProduct(productId);
						for(Product product:productlist) {
							System.out.println(product);
							break;
						}
						
					}
break;
				}
			}















		}//end of first while
	}//end of main

}//end of class
