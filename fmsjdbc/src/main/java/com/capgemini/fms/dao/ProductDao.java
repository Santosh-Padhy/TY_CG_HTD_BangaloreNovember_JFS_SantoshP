package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.Product;

public interface ProductDao {
public Product addProduct(Product product);
public boolean removeProduct(int productId);
public List<Product> getAllProduct(int ProductId);
}
