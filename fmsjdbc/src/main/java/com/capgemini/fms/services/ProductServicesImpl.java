package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Product;
import com.capgemini.fms.dao.ProductDao;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices {
ProductDao productdao = ProductFactory.instanceOfProdcutDaoImpl();
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.addProduct(product); 
	}

	public boolean removeProduct(int productId) {
		// TODO Auto-generated method stub
		return productdao.removeProduct(productId);
	}

	public List<Product> getAllProduct(int ProductId) {
		// TODO Auto-generated method stub
		return productdao.getAllProduct(ProductId);
	}

}
