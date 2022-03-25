package com.pesol.spring.service;

import java.util.List;

import com.pesol.spring.entity.Product;

public interface ProductService {

	List<Product> findAll();
	
	Product findById(int id);
	
	void add(Product product);
	
	void update(Product product);
	
	void delete(int id);
}
