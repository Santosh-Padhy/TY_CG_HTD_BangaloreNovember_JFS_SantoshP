package com.capgemini.fms.factory;

import com.capgemini.fms.dao.CustomerDao;
import com.capgemini.fms.dao.CustomerDaoImpl;
import com.capgemini.fms.dao.ProductDao;
import com.capgemini.fms.dao.ProductDaoImpl;
import com.capgemini.fms.services.CustomerServices;
import com.capgemini.fms.services.CustomerServicesImpl;
import com.capgemini.fms.services.ProductServices;
import com.capgemini.fms.services.ProductServicesImpl;

public class ProductFactory {
public static ProductDao instanceOfProdcutDaoImpl() {
	ProductDao productdao = new ProductDaoImpl();
	return productdao;
}// 
 public static ProductServices instanceOfProductServicesImpl() {
	 ProductServices productservice = new ProductServicesImpl();
	 return productservice;
 }


}
