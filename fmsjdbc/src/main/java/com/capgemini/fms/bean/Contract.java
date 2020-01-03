package com.capgemini.fms.bean;

import java.util.Date;

public class Contract {
	private int contractno;
	private int customerid;
	private int productid;
	private int haulierid;
	private Date deliverydate;
	private String deliveryday;
	private int quantity;
	public int getContractno() {
		return contractno;
	}
	public void setContractno(int contractno) {
		this.contractno = contractno;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getHaulierid() {
		return haulierid;
	}
	public void setHaulierid(int haulierid) {
		this.haulierid = haulierid;
	}
	public Date getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getDeliveryday() {
		return deliveryday;
	}
	public void setDeliveryday(String deliveryday) {
		this.deliveryday = deliveryday;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Contract [contractno=" + contractno + ", customerid=" + customerid + ", productid=" + productid
				+ ", haulierid=" + haulierid + ", deliverydate=" + deliverydate + ", deliveryday=" + deliveryday
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
}
