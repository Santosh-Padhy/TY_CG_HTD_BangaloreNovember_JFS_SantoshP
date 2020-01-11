package com.capgemini.springbootapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.capgemini.springbootapp.dto.OrderInfo;
import com.capgemini.springbootapp.dto.ProductInfo;

public class OrderDaoImpl implements OrderDao {
	@PersistenceUnit
	EntityManagerFactory factory;
	

	public OrderInfo getOrderById(int id) {
		EntityManager manager = factory.createEntityManager();
		OrderInfo order=manager.find(OrderInfo.class, id);
		return order;
	}

}