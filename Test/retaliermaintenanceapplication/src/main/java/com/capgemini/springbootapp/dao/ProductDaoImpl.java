package com.capgemini.springbootapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.springbootapp.dto.ProductInfo;
@Repository
public class ProductDaoImpl  implements ProductDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public ProductInfo getProductById(int productId) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product=manager.find(ProductInfo.class, productId);
		return product;
	}
	}


