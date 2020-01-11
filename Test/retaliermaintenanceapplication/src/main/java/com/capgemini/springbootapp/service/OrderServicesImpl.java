package com.capgemini.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.springbootapp.dao.OrderDao;
import com.capgemini.springbootapp.dto.OrderInfo;

public class OrderServicesImpl implements OrderService {
	@Autowired
private OrderDao orderdao;
	@Override
	public OrderInfo getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderdao.getOrderById(id);
	}

}
