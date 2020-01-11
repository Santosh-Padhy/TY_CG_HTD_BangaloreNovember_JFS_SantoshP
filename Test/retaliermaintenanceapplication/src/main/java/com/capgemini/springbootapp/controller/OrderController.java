package com.capgemini.springbootapp.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootapp.dto.OrderInfo;
import com.capgemini.springbootapp.dto.OrderInfoResponse;
import com.capgemini.springbootapp.dto.ProductInfo;
import com.capgemini.springbootapp.dto.ProductInfoResponse;
import com.capgemini.springbootapp.service.OrderService;
@RestController
public class OrderController {
	@Autowired
	OrderService service;
	@GetMapping(path="/get-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse getOrderById(@RequestParam("id") int id) {
		OrderInfoResponse response = new OrderInfoResponse();
		OrderInfo order=service.getOrderById(id);
		if(order!=null) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setOrder(Arrays.asList(order));
		} else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}	
	
	
}
