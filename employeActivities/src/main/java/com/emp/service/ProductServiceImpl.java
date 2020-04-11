package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.exception.RecordNotFoundException;
import com.emp.model.Product;
import com.emp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository pRepository;

	@Override
	public Product saveproduct(Product product) {
		Product saveprod=pRepository.save(product);
		return saveprod;
	}

	@Override
	public List<Product> findAllProducts() {
		
		Iterable<Product> findp=pRepository.findAll();
		
		return (List<Product>) findp;
	}

	@Override
	public Product findProdById(long productid) throws RecordNotFoundException {
		
		Optional<Product> findprodById=pRepository.findById(productid);
		
		if(findprodById.isPresent()) {
			Product productById=findprodById.get();
			return productById;
		}else {
			throw new RecordNotFoundException("No records Found");
		}
	}
	
	
	
	
}
