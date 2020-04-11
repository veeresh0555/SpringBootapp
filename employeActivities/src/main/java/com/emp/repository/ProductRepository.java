package com.emp.repository;

import org.springframework.data.repository.CrudRepository;

import com.emp.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
