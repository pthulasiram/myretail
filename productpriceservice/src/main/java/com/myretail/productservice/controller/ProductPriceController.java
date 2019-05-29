/**
 * 
 */
package com.myretail.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.productservice.entity.Product;
import com.myretail.productservice.service.ProductPriceService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author thulasiram
 *
 */
@RestController
@Api(value = "Product Price Service", description = "Operations perfomed to manage products ptrices in Product management system")
public class ProductPriceController {
	@Autowired
	ProductPriceService productPriceService;

	@ApiOperation(value = "View a list of available prodcuts price", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/product/{productid}")

	public Optional<Product> getProductById(@PathVariable("productid") Long id) {
		Optional<Product> p = productPriceService.getProductById(id);
		return p;
	}

	@ApiOperation(value = "This API is used to add product to Product price database", response = List.class)
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product p) {
		return productPriceService.addProduct(p);
	}

	@ApiOperation(value = "update prodcuts price", response = List.class)
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product p) {
		Product product = null;
		if (p != null && productPriceService.isProductExistsById(p.getId())) {
			product = productPriceService.updateProduct(p);
		}
		return product;
	}

	@DeleteMapping("/product/{productid}")
	public void deleteByProductId(@PathVariable("productid") Long id) {
		if (id != null && productPriceService.isProductExistsById(id)) {
			productPriceService.deleteProduct(id);
		}

	}

}
