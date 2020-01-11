package com.capgemini.springbootapp.dao;

import com.capgemini.springbootapp.dto.ProductInfo;

public interface ProductDao {
	ProductInfo getProductById(int productId);
}
