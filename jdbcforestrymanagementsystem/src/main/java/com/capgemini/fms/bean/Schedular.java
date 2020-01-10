package com.capgemini.fms.bean;

public class Schedular {
private int schedularid;
private String date;
private int productid;
private int quantity;
public int getSchedularid() {
	return schedularid;
}
public void setSchedularid(int schedularid) {
	this.schedularid = schedularid;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Schedular [schedularid=" + schedularid + ", date=" + date + ", productid=" + productid + ", quantity="
			+ quantity + "]";
}

}
