package com.capg.phonesimulatorbean;

public class Contact {
private int contactno;
private String contactname;
private String groups;
public int getContactno() {
	return contactno;
}
public String getGroups() {
	return groups;
}
public void setGroups(String groups) {
	this.groups = groups;
}
public void setContactno(int contactno) {
	this.contactno = contactno;
}
public String getContactname() {
	return contactname;
}
public void setContactname(String contactname) {
	this.contactname = contactname;
}
@Override
public String toString() {
	return "Contact [contactno=" + contactno + ", contactname=" + contactname + "]";
}
	
}
