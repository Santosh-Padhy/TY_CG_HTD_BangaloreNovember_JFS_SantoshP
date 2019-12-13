package com.capg.phonesimulatorfactory;

import com.capg.phonesimulatorbean.Contact;
import com.capg.phonesimulatordao.PhoneDao;
import com.capg.phonesimulatordaoImpl.*;
public class PhoneFactory {

	private PhoneFactory() {

	}
	
	public static Contact getContact() {
		return new Contact();
	}
	
	public static PhonedaoImpl getPhoneDaoImpl()
	{
		return new PhonedaoImpl();
	}



}
