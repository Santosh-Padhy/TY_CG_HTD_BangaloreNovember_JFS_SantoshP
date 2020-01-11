package com.capgemini.springbootapp.service;

import com.capgemini.springbootapp.dto.OrderInfo;

public interface OrderService {
	public OrderInfo getOrderById(int id);
}
