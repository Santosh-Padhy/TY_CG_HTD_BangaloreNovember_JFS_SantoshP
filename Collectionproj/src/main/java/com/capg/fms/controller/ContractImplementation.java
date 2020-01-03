package com.capg.fms.controller;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capg.fms.bean.Contract;
import com.capg.fms.dao.ForestDao;
import com.capg.fms.exception.CustomerIdNotFoundException;
import com.capg.fms.exception.DataSetException;
import com.capg.fms.factory.FmsFactory;

public class ContractImplementation {
	public static void contract() {
		String[] array=null;
		Scanner sc=new Scanner(System.in);
		ForestDao fd=FmsFactory.getForestDAOImpl();
		CustomerIdNotFoundException  custom = null;
		LinkedHashMap<Integer, Contract> response=null;
		while (true) {
			Contract contractbean=FmsFactory.getContract();
			System.out.println("1.Insert Contract data");
			System.out.println("2.Delete Contract data");
			System.out.println("3.Search Contract data");
			System.out.println("4.To get all Contract data");
			System.out.println("5.To know the size");
			System.out.println("6.HOME");
			System.out.println("7.Modify Contract data");

			int choice=sc.nextInt();
			switch (choice) {
			case 1:
		System.out.println("Enter contract id:");
		int contractno=sc.nextInt();
			System.out.println("ContactNumber:");
			contractbean.setContractno(sc.nextInt()) ;
			System.out.println("CustomerId:");
			contractbean.setCustomerid(sc.nextInt());
			System.out.println("Productid:");
			contractbean.setProductid(sc.nextInt());
			System.out.println("Haulierid:");
			contractbean.setHaulierid(sc.nextInt());
			System.out.println("Deliverydate:");
			contractbean.setDeliverydate(sc.next());
			System.out.println("Deliveryday:");
			contractbean.setDeliveryday(sc.next());
			System.out.println("Quantity:");
			contractbean.setQuantity(sc.nextInt());
			response=fd.addTheContract(contractbean,contractno);
			if(response!=null) {
				System.out.println("Data Inserted Successfully");
			}else {
				try {
					fd.addTheContract(contractbean, contractno);
				}catch(DataSetException e) {
				 	System.out.println("Data is not inserted ");
				}
			}//end of else 
			break;
			case 2:
				System.out.println("Enter Contractid to delete the data");
				int delete=sc.nextInt();
				response.remove(delete);
				break;
			case 3:
				System.out.println("Enter ContractNumber to search the data");
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
	
			case 4:if(response!=null) {
				Set<Map.Entry<Integer, Contract>> s1=response.entrySet();
				System.out.println("--------------------THE CONTRACT DETAILS ARE---------------");
				for (Map.Entry<Integer, Contract> entry : s1) {
					System.out.println("THE CONTRACT NO IS : "+entry.getKey());
					System.out.println(entry.getValue());
				}
				System.out.println("***********************************************************");
				break;
			}
			
			case 5:
				AccessPage.main(array);
				break;
			case 6:
				System.out.println("Give the Contract number Modify the Contract Details:");
				int modify=sc.nextInt();
				Contract modify1=FmsFactory.getContract();
				System.out.println("ContactNumber:");
				modify1.setContractno(sc.nextInt()) ;
				System.out.println("CustomerId:");
				modify1.setCustomerid(sc.nextInt());
				System.out.println("Productid:");
				modify1.setProductid(sc.nextInt());
				System.out.println("Haulierid:");
				modify1.setHaulierid(sc.nextInt());
				System.out.println("Deliverydate:");
				modify1.setDeliverydate(sc.next());
				System.out.println("Deliveryday:");
				modify1.setDeliveryday(sc.next());
				System.out.println("Quantity:");
				modify1.setQuantity(sc.nextInt());
				response.replace(modify,modify1);
				break;
				
			default:
				break;
			}
			//sc.close();
		}

	}
	
}
	