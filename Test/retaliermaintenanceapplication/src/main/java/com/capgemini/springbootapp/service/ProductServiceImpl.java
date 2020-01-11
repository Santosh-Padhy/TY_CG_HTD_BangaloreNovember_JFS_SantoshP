package com.capgemini.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springbootapp.dao.ProductDao;
import com.capgemini.springbootapp.dto.ProductInfo;
@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao productdao;

	@Override
	public ProductInfo getProductById(int productId) {
		
		return productdao.getProductById(productId);
	}
	
	

}
