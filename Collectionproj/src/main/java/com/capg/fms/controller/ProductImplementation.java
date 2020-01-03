package com.capg.fms.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capg.fms.bean.Product;
import com.capg.fms.dao.ForestDao;
import com.capg.fms.factory.FmsFactory;

public class ProductImplementation {
	public static void product() {
		String[] array=null;
	
	Scanner sc=new Scanner(System.in);
	ForestDao productimpl=FmsFactory.getForestDAOImpl();
	Map<Integer, Product> presponse=null;
	while (true) {
		Product pbean=FmsFactory.getProduct();
		System.out.println("1.Insert Product data");
		System.out.println("2.Delete Product data");
		System.out.println("3.Search Product data");
		System.out.println("4.To get all Product data");
		System.out.println("5.To know the size");
		System.out.println("6.HOME");
		System.out.println("7.Modify Product details");
		int choice1=sc.nextInt();
		switch (choice1) {
		case 1:	
			System.out.println("Productid:");
			pbean.setProductId(sc.nextInt());
			System.out.println("ProductName:");
			pbean.setProductName(sc.next());
	
			presponse= productimpl.addTheProduct(pbean);

			break;
		case 2:
			System.out.println("Enter ProductNumber to delete the data");
			int delete=sc.nextInt();
			presponse.remove(delete);
			break;
		case 3:
			System.out.println("Enter ProductNumber to search the data");
			int detail=sc.nextInt();
			boolean b1=presponse.containsKey(detail);
			if(b1==true) {
				System.out.println("-----------PRODUCT DETAILS---------");
				System.out.println("*************************************");
				System.out.println("THE PRODUCT DETAILS ARE:"+detail);
				Collection<Product> c1=presponse.values();
				for (Product product : c1) {
					System.out.println(product);
				}
			}
			break;
		case 4:if(presponse!=null) {
			Set<Map.Entry<Integer, Product>> s1=presponse.entrySet();
			System.out.println("--------------------THE PRODUCT DETAILS ARE---------------");
			System.out.println("************************************************************");
			for (Map.Entry<Integer, Product> entry : s1) {
				System.out.println("THE PRODUCT NUMBER IS : "+entry.getKey());
				System.out.println(entry.getValue());
			}}
			System.out.println("------------------------------------------------------------");
			break;
		case 5:
			System.out.println("THE SIZE IS: "+presponse.size());
			break;
		case 6:
			AccessPage.main(array);
			break;
		case 7:
			System.out.println("Modify the Product Details:");
			int modify=sc.nextInt();
			Product pbean1=FmsFactory.getProduct();
			
			System.out.println("Productid:");
			pbean1.setProductId(sc.nextInt());
			System.out.println("ProductName:");
			pbean1.setProductName(sc.next());
			
			presponse.replace(modify, pbean1);
		default:
			break;
		}
		//sc.close();
	}
	}
}

