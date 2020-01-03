package com.capg.fms.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capg.fms.dao.ForestDao;
import com.capg.fms.factory.FmsFactory;
import com.capg.fms.bean.Customer;
public class CustomerImplementation{
	public static void customer() {
		String[] array=null;
	Scanner sc=new Scanner(System.in);
	Map<Integer, Customer> response=null;
	ForestDao fs=FmsFactory.getForestDAOImpl();{

		while (true) {
			Customer customerbean=FmsFactory.getCustomer();
			System.out.println("1.Insert customer data");
			System.out.println("2.Delete customer data");
			System.out.println("3.Search customer data");
			System.out.println("4.To get all customer data");
			System.out.println("5.To know the size");
			System.out.println("6.HOME");
			int choice1=sc.nextInt();
			switch (choice1) {
			case 1:	
				System.out.println("Customerid:");
				customerbean.setCustomerid(sc.nextInt());
				System.out.println("CustomerName:");
				customerbean.setCustomerName(sc.next());
				System.out.println("StreetAdderss1:");
				customerbean.setStreetAddress1(sc.next());
				System.out.println("StreetAddress2:");
				customerbean.setStreetAddress2(sc.next());
				System.out.println("Town:");
				customerbean.setTown(sc.next());
				System.out.println("Postalcode:");
				customerbean.setPostalCode(sc.nextInt());
				System.out.println("EmailId:");		 	
				customerbean.setEmail(sc.next());
				System.out.println("TelephoneNumber");
				customerbean.setTelephoneNumber(sc.nextInt());

				response=fs.addTheCustomer(customerbean);

				break;
			case 2:
				System.out.println("Enter CustomerNumber to delete the data");
				int delete=sc.nextInt();
				response.remove(delete);
				break;
			case 3:
				System.out.println("Enter CustomerNumber to search the data");
				int detail=sc.nextInt();
				boolean b1=response.containsKey(detail);
				if(b1==true) {
					System.out.println("-----------CUSTOMER DETAILS---------");
					System.out.println("*************************************");
					System.out.println("THE CUSTOMER DETAILS ARE:"+detail);
					Collection<Customer> c1=response.values();
					for (Customer customer : c1) {
						System.out.println(customer);
					}
				}
				break;
			case 4:
				Set<Map.Entry<Integer, Customer>> s1=response.entrySet();
				System.out.println("--------------------THE CUSTOMER DETAILS ARE---------------");
				System.out.println("************************************************************");
				for (Map.Entry<Integer, Customer> entry : s1) {
					System.out.println("THE CUSTOMER NUMBER IS : "+entry.getKey());
					System.out.println(entry.getValue());
				}
				System.out.println("------------------------------------------------------------");
				break;
			case 5:
				System.out.println("THE SIZE IS: "+response.size());
				break;
			case 6:
				AccessPage.main(array);
				break;
			case 7:
				System.out.println("Modify the Customer Details:");
				int modify=sc.nextInt();
				Customer crbean=FmsFactory.getCustomer();

				System.out.println("Customerid:");
				crbean.setCustomerid(sc.nextInt());
				System.out.println("CustomerName:");
				crbean.setCustomerName(sc.next());
				System.out.println("StreetAdderss1:");
				crbean.setStreetAddress1(sc.next());
				System.out.println("StreetAddress2:");
				crbean.setStreetAddress2(sc.next());
				System.out.println("Town:");
				crbean.setTown(sc.next());
				System.out.println("Postalcode:");
				crbean.setPostalCode(sc.nextInt());
				System.out.println("EmailId:");		 	
				crbean.setEmail(sc.next());
				System.out.println("TelephoneNumber");
				crbean.setTelephoneNumber(sc.nextInt());
				response.replace(modify, crbean);
			default:
				break;
			}
			//sc.close();
		}

	}

}
}