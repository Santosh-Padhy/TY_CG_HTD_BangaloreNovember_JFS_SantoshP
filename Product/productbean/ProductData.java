package com.capg.productbean;

public class ProductData {
private int productid;
private String productname;
private double productcost;
@Override
public String toString() {
	return "ProductData [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
			+ ", productcolor=" + productcolor + ", productdescp=" + productdescp + "]";
}
private String productcolor;
private String productdescp;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getProductcost() {
	return productcost;
}
public void setProductcost(double productcost) {
	this.productcost = productcost;
}
public String getProductcolor() {
	return productcolor;
}
public void setProductcolor(String productcolor) {
	this.productcolor = productcolor;
}
public String getProductdescp() {
	return productdescp;
}
public void setProductdescp(String productdescp) {
	this.productdescp = productdescp;
}

}
