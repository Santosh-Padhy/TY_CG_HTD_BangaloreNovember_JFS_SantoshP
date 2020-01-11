package com.capgemini.springbootapp.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootapp.dto.ProductInfo;
import com.capgemini.springbootapp.dto.ProductInfoResponse;
import com.capgemini.springbootapp.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;
	@GetMapping(path="/get-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse getProductById(@RequestParam("id") int id) {
		ProductInfoResponse response = new ProductInfoResponse();
		ProductInfo product=productservice.getProductById(id);
		if(product!=null) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(product));
		} else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}	
}
