package com.pesol.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pesol.spring.dao.ProductRepository;
import com.pesol.spring.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(int id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void add(Product product) {
		productRepository.save(product);
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(int id) {
		Product product = productRepository.findById(id).get();
		if (product != null) {
			productRepository.delete(product);
		}
	}

}
