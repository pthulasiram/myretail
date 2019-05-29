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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.productservice.entity.Product;
import com.myretail.productservice.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author thulasiram
 *
 */
@RestController
@RequestMapping("/api")
@Api(value="Product Service", description="Operations perfomed to manage products in Product management system")
public class ProductController {
	@Autowired
	public ProductService productService;

	@ApiOperation(value = "View a list of available prodcuts", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/products")
	public List<Product> listAllProducts() {
		return productService.listAllProducts();
	}
	@ApiOperation(value="create product ")
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return productService.save(product);

	}
	
	@ApiOperation(value="update product ")
	@PutMapping("/product")
	public Object updateProduct(@RequestBody Product product) {
		if(productService.isProductExists(product.getId())) {
			return productService.save(product);
		}
		return product.getId() +"is not exists";

	}
	
	@ApiOperation(value="delete product by product id")
	@DeleteMapping("/product/{productid}")
	public void deleteProduct(@PathVariable("productid") Long productId) {
		if(productService.isProductExists(productId)) {
			productService.deleteProductByProductId(productId);
		}
	

	}
	
	@ApiOperation(value="get product by product id")
	@GetMapping("/product/{productid}")
	public Optional<Product> getProductId(@PathVariable("productid") Long productId) {
		return productService.getProductById(productId);

	}
}
