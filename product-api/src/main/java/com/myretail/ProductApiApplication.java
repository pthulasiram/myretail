package com.myretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApiApplication.class, args);
	}

}


//@Component
//class DiscoveryClientExample implements CommandLineRunner {
//
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @Override
//    public void run(String... strings) throws Exception {
//        discoveryClient.getInstances("product-service").forEach((ServiceInstance s) -> {
//            System.out.println(ToStringBuilder.reflectionToString(s));
//        });
//        
//        discoveryClient.getInstances("product-price-service").forEach((ServiceInstance s) -> {
//        	System.out.println(s.getUri());
//            System.out.println(ToStringBuilder.reflectionToString(s));
//        });
//    }
//}
