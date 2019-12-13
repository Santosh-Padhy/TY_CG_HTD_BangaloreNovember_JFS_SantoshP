package com.capg.phonesimulatorbean;

public class Contact {
	private long contactno;
	private String contactname;
	private String groups;

	public long getContactno() {
		return contactno;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public void setContactno(long l) {
		this.contactno = l;
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
