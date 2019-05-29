/**
 * 
 */
package com.myretail.productservice.service;

import java.util.Optional;

import com.myretail.productservice.entity.Product;

/**
 * @author thulasiram
 *
 */
public interface ProductPriceService {
	public Product addProduct(Product p);
	public Product updateProduct(Product p);
	public void deleteProduct(Long id);
	public Optional<Product> getProductById(Long id);
	public Boolean isProductExistsById(Long id);

}
