package com.capg.phonesimulatorcontroller;

import java.util.List;

import com.capg.phonesimulatorbean.Contact;
import com.capg.phonesimulatordaoImpl.PhonedaoImpl;
import com.capg.phonesimulatorfactory.PhoneFactory;

public class GetAll {
	public static void main(String[] args) {
	
			PhonedaoImpl phone =  PhoneFactory.getPhoneDaoImpl();
			List<Contact> list=phone.getAllContact();
			
			if(list!=null) {
				for (Contact con : list) {
					System.out.println(con);
				}
			}
	}
}
