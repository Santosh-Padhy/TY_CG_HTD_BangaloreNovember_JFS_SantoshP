package com.capg.fms.bean;

public class Product {
@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
private	int productId;
private	String productName;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
	
	
	
	
	
}
