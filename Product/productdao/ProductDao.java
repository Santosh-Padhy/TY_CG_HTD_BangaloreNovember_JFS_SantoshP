package com.capg.productdao;
import java.util.List;

import com.capg.productbean.*;
public interface ProductDao {
public List<ProductData> getAllProduct(String name);
public ProductData buyProduct( ProductData id);
public ProductData SearchProduct(String name);


}
