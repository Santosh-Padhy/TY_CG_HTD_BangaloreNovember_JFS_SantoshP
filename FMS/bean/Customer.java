package com.capg.fms.bean;

public class Customer {
		@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", streetAddress1="
				+ streetAddress1 + ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalCode="
				+ postalCode + ", email=" + email + ", telephoneNumber=" + telephoneNumber + "]";
	}
		private int customerid;
		private String customerName;
		private String streetAddress1;
		private String streetAddress2;
		private String town;
		private int postalCode;
		private String email;
		private int telephoneNumber;
		public int getCustomerid() {
			return customerid;
		}
		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getStreetAddress1() {
			return streetAddress1;
		}
		public void setStreetAddress1(String streetAddress1) {
			this.streetAddress1 = streetAddress1;
		}
		public String getStreetAddress2() {
			return streetAddress2;
		}
		public void setStreetAddress2(String streetAddress2) {
			this.streetAddress2 = streetAddress2;
		}
		public String getTown() {
			return town;
		}
		public void setTown(String town) {
			this.town = town;
		}
		public int getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(int postalCode) {
			this.postalCode = postalCode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelephoneNumber() {
			return telephoneNumber;
		}
		public void setTelephoneNumber(int telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}
	
	
	
	
	
	
	
	
	
	

}
