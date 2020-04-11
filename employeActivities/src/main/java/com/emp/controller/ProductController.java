package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.exception.RecordNotFoundException;
import com.emp.model.Product;
import com.emp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService pservice;
	
	@PostMapping("/saveproduct")
	public ResponseEntity<Product> saveproduct(Product product){
		Product sproduct=pservice.saveproduct(product);
		return new ResponseEntity<>(sproduct,new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllproducts(){
		List<Product> listOfproducts=pservice.findAllProducts();
		return new ResponseEntity<List<Product>>(listOfproducts,new HttpHeaders(), HttpStatus.OK);
	}
	
	
	@GetMapping("/{productid}")
	public Optional<Product> getProductById(@PathVariable("productid")long productid)throws RecordNotFoundException{
		Product getPruductById=pservice.findProdById(productid);
		return Optional.of(getPruductById);
		
	}
	
	
	
}
