package com.emp.service;

import java.util.List;

import com.emp.exception.RecordNotFoundException;
import com.emp.model.Product;

public interface ProductService {

	public Product saveproduct(Product product);

	public List<Product> findAllProducts();

	public Product findProdById(long productid) throws RecordNotFoundException;

	

}
