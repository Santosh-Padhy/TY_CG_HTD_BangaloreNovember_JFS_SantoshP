package com.capg.productcontroller;
import java.util.*;
import com.capg.productdao.*;
import com.capg.productfactory.*;
import com.capg.productbean.*;
public class AcessAll {
public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	ProductDao dao= ProductFactory.getProductDaoImpl();
	while(true) {
		System.out.println("-----****WELCOME TO USER Flipkart APPLICATION DEVELOPEMENT****-----");
		System.out.println(" 1.See all the item");
		System.out.println("2.Search product");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			List<ProductData> l1= dao.getAllProduct();
			if(l1!=null) {
				for (ProductData product : l1) {
					System.out.println(product);
				}
			} else {
				System.err.println("no data found");
			}
			break;
		case 2:
			dao.getAllProduct();

			
	
	
	
	
	
	
	
	
	
}//end of main	
}//end of class
}
}
