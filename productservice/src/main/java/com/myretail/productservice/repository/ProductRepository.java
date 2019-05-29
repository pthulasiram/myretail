package com.myretail.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myretail.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
