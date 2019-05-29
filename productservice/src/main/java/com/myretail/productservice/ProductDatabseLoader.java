package com.myretail.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.myretail.productservice.entity.Product;
import com.myretail.productservice.service.ProductService;

@Order(1)
@Component
public class ProductDatabseLoader implements CommandLineRunner {
	@Autowired
	ProductService productService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productService.save(new Product(1l,"IPhone 5",0l));
		productService.save(new Product(1l,"IPhone 5s",0l));
		productService.save(new Product(1l,"IPhone 6",0l));
		productService.save(new Product(1l,"IPhone 6s",0l));
		productService.save(new Product(1l,"IPhone 8",0l));
		productService.save(new Product(1l,"IPhone X",0l));
		productService.save(new Product(1l,"IPhone XS",0l));



	}

}
