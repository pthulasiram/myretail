package com.myretail;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myretail.model.ProductDetail;

@FeignClient("product-service")
interface ProductDetailClient {

	@RequestMapping(method = RequestMethod.GET, value = "/product/{productid}")
	ProductDetail getProductDetailsById(@PathVariable("productid") Long id);
}