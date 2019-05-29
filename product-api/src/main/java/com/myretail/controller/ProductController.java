/**
 * 
 */
package com.myretail.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.controller.exception.ProductNotFoundException;
import com.myretail.model.Product;
import com.myretail.service.ProductService;

/**
 * @author thulasiram
 *
 */
@RestController
public class ProductController {
	@Autowired
	ProductService service;

	/**
	 * To fetch product details by given product id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/product/{productid}")
	public Product getProductById(@PathVariable("productid") Long id) {
		// return new ProductDetail();
		Product product = null;
		try {
			product = service.getProductById(id);

		} catch (NoSuchElementException k) {
			throw new ProductNotFoundException("product: id " + id + " not Found");
		}
		if (product.getId() == null) {
			throw new ProductNotFoundException("product id " + id + " not Found");
		}
		return product;
	}

	@DeleteMapping("/product/{productid}")
	public void deleteProductById(@PathVariable("productid") Long id) {
		try {
			service.deleteProductById(id);
		} catch (NoSuchElementException k) {
			throw new ProductNotFoundException("product: id " + id + " not Found");
		}

	}
	
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product p) {
		try {
			p = service.createProduct(p);
		} catch (NoSuchElementException k) {
			throw new ProductNotFoundException("product: id " + p.getId() + " not Found");
		}
		if (p.getId() == null) {
			throw new ProductNotFoundException("Failed to create new product");
		}
		return p;

	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product p) {
		try {
			p = service.updateProduct(p);
		} catch (NoSuchElementException k) {
			throw new ProductNotFoundException("product: id " + p.getId() + " not Found");
		}
		if (p.getId() == null) {
			throw new ProductNotFoundException("Failed to create new product");
		}
		return p;

	}

}
