package com.pesol.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pesol.spring.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
