/**
 * 
 */
package com.myretail.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myretail.productservice.entity.Product;

/**
 * @author thulasiram
 *
 */
public interface ProductPriceRepository extends JpaRepository<Product,Long>{

}
