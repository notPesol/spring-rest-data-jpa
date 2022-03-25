package com.pesol.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pesol.spring.entity.Product;
import com.pesol.spring.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> findAll() {
		return productService.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return productService.findById(id);
	}
	
	@PostMapping
	public Product add(@RequestBody Product product) {
		productService.add(product);
		return product;
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		productService.update(product);
		return product;
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		productService.delete(id);
		return "Deleted product id - " + id;
	}
}
