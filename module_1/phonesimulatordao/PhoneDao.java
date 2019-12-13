package com.capg.phonesimulatordao;

import java.util.List;

import com.capg.phonesimulatorbean.Contact;

public interface PhoneDao {
	public List<Contact> getAllContact();

public boolean editContact(String name);
	public boolean addContact(Contact con);
	public boolean searchContact(String name);
	public boolean deleteContact(String name);


}
