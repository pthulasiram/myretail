/**
 * 
 */
package com.myretail.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.productservice.entity.Product;
import com.myretail.productservice.repository.ProductRepository;

/**
 * @author thulasiram
 *
 */
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> listAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}

	public void deleteProductByProductId(Long id) {
		productRepository.deleteById(id);
	}
	
	public Product save(Product p) {
		return productRepository.save(p);

	}
	
	public Boolean isProductExists(Long productId) {
		return productRepository.existsById(productId);
	}

}
