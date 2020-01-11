package com.capgemini.springbootapp.dto;

import java.util.List;

public class ProductInfoResponse {
	private int statuscode;
	private String message;
	private String description;
	private List<ProductInfo> product;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<ProductInfo> getProduct() {
		return product;
	}
	public void setProduct(List<ProductInfo> product) {
		this.product = product;
	}
}
