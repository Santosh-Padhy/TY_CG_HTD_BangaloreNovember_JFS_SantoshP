package com.capgemini.springbootapp.dao;

import com.capgemini.springbootapp.dto.OrderInfo;

public interface OrderDao {
public OrderInfo getOrderById(int id);
}
