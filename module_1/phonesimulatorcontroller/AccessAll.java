package com.capg.phonesimulatorcontroller;
import java.util.List;

import java.util.Scanner;

import com.capg.phonesimulatorbean.Contact;
import com.capg.phonesimulatordaoImpl.PhonedaoImpl;
import com.capg.phonesimulatorfactory.PhoneFactory;
import com.capg.phonesimulatorbean.*;
public class AccessAll {

	public static void main(String[] args ) {

		Scanner sc=  new Scanner(System.in);
		PhonedaoImpl pa= PhoneFactory.getPhoneDaoImpl();
		while(true) {
			System.out.println("Enter option to execute the operations");
			System.out.println("1.Insert the contact\n");
			System.out.println("2.Delete contact\n");
			System.out.println("3.update contact\n");
			System.out.println("4.Getall contacts\n");
			System.out.println("5.Go to Main Menu");

			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the contact details to insert");
				Contact con = new Contact();
				System.out.println("Enter the name ");
				con.setContactname(sc.next());
				System.out.println("enter the phone number");
				con.setContactno(sc.nextLong());
				System.out.println("enter the group name");
				con.setGroups(sc.next());
				if(pa.addContact(con)) {
				System.out.println("contact inserted");
				} else {
			System.out.println("contact not inserted");
			break;}
		case 2:
		System.out.println("enter contact name to delete");
			String name=sc.next();
			if(pa.deleteContact(name)) {
			System.out.println("contact deleted");
			} else {
			System.out.println("contact not found");
			}
			break;


		}

		}
	}
}










