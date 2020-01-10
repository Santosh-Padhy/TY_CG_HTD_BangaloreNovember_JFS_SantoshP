package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Product;

public interface ProductServices {
	public Product addProduct(Product product);
	public boolean removeProduct(int productId);
	public List<Product> getAllProduct(int ProductId);
}
