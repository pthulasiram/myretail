package com.myretail.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.myretail.productservice.entity.Product;
import com.myretail.productservice.service.ProductPriceService;

@Order(1)
@Component
public class ProductDatabseLoader implements CommandLineRunner {
	@Autowired
	ProductPriceService productPrice;

	public void run(String... args) throws Exception {
		productPrice.addProduct(new Product(10000l, 449d, "USD"));
		productPrice.addProduct(new Product(10001l, 649d, "USD"));

		productPrice.addProduct(new Product(10002l, 749d, "USD"));

		productPrice.addProduct(new Product(10003l, 849d, "USD"));

		productPrice.addProduct(new Product(10004l, 949d, "USD"));

		productPrice.addProduct(new Product(10005l, 999d, "USD"));

	}

}
