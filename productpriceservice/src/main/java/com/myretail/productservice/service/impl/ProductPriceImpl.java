/**
 * 
 */
package com.myretail.productservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.productservice.entity.Product;
import com.myretail.productservice.repository.ProductPriceRepository;
import com.myretail.productservice.service.ProductPriceService;

/**
 * @author thulasiram
 *
 */
@Service
public class ProductPriceImpl implements ProductPriceService {
	@Autowired
	ProductPriceRepository repository;
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void deleteProduct(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Optional<Product> getProductById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	@Override
	public Boolean isProductExistsById(Long id) {
		return repository.existsById(id);
	}

}
