package com.capgemini.springbootapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order_info")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id;
	@Column
	private int productid;
	@Column
	private int userid;
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="userid",referencedColumnName="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}
