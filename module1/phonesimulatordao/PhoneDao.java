package com.capg.phonesimulatordao;

import java.util.List;

import com.capg.phonesimulatorbean.Contact;

public interface PhoneDao {
	public List<Contact> getAllContact();

public boolean editContact();
	public boolean addContact();
	public boolean searchContact();
	public boolean deleteContact();


}
