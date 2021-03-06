package com.myretail.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ProductpriceserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductpriceserviceApplication.class, args);
	}

}
