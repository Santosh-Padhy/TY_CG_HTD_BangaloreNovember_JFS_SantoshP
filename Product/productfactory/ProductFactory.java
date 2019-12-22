package com.capg.productfactory;

import com.capg.productdao.*;
import com.capg.productbean.*;

public class ProductFactory {
		private ProductFactory()
		{
			
		}
		public static ProductData getProduct() {
			return new ProductData();
		}

		public static ProductDaoImpl getProductDaoImpl()
		{
			return new ProductDaoImpl();
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
