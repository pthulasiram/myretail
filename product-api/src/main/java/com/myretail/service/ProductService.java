package com.myretail.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.myretail.model.Price;
import com.myretail.model.Product;
import com.myretail.model.ProductDetail;
import com.myretail.model.ProductPrice;

@Service
public class ProductService {
	private final RestTemplate restTemplate;
	@Value("${product-service.url}")
	private String productServiceUrl;
	@Value("${product-price-service.url}")
	private String productPriceServiceUrl;

	public ProductService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * Used to fetch Product details information from product-service
	 * 
	 * @param id
	 * @return
	 */
	public ProductDetail getProductDetailsById(Long id) {

		String url = productServiceUrl + "product/" + id;
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		ResponseEntity<ProductDetail> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
				ProductDetail.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	public ProductPrice getProductPriceById(Long id) {
		String url = productPriceServiceUrl + "product/" + id;
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		ResponseEntity<ProductPrice> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
				ProductPrice.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	/**
	 * This method is used to update records in product price details using
	 * product-price service
	 * 
	 * @param p
	 * @return
	 */
	public ProductPrice updateProductPrice(ProductPrice p) {
		String url = productPriceServiceUrl + "product/";
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<ProductPrice> requestEntity = new HttpEntity<ProductPrice>(p, requestHeaders);
		ResponseEntity<ProductPrice> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity,
				ProductPrice.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	/**
	 * This method is used to add mew product price details using product-price
	 * service
	 * 
	 * @param p
	 * @return
	 */
	public ProductPrice addProductPrice(ProductPrice p) {
		String url = productPriceServiceUrl + "product/";
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<ProductPrice> requestEntity = new HttpEntity<ProductPrice>(p, requestHeaders);
		ResponseEntity<ProductPrice> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity,
				ProductPrice.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	/**
	 * delete product by id in product price service
	 * 
	 * @param id
	 * @return
	 */
	public String deleteProductPriceById(Long id) {
		String url = productPriceServiceUrl + "product/" + id;
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, null, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	/**
	 * This method is used to update records in product price details using
	 * product-price service
	 * 
	 * @param p
	 * @return
	 */
	public ProductDetail updateProductDetail(ProductDetail p) {
		String url = productServiceUrl + "product/";
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<ProductDetail> requestEntity = new HttpEntity<ProductDetail>(p, requestHeaders);
		ResponseEntity<ProductDetail> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity,
				ProductDetail.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	/**
	 * This method is used to add mew product price details using product-price
	 * service
	 * 
	 * @param p
	 * @return
	 */
	public ProductDetail addProductDetail(ProductDetail p) {
		String url = productServiceUrl + "product/";
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<ProductDetail> requestEntity = new HttpEntity<ProductDetail>(p, requestHeaders);
		ResponseEntity<ProductDetail> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity,
				ProductDetail.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}
	/**
	 * delete product by id in product price service
	 * 
	 * @param id
	 * @return
	 */
	public String deleteProductDetailById(Long id) {
		String url = productServiceUrl + "product/" + id;
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, null, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			System.out.println("response received");
			System.out.println(responseEntity.getBody());
		} else {
			System.out.println("error occurred");
			System.out.println(responseEntity.getStatusCode());
		}
		return responseEntity.getBody();
	}

	/**
	 * Fetch Product Id by accessing data from product service, product-price
	 * service
	 * 
	 * @param id
	 * @return
	 */
	public Product getProductById(Long id) {

		ProductDetail pd = getProductDetailsById(id);
		ProductPrice pp = getProductPriceById(id);
		Product p = new Product();
		Price price = new Price();
		if (pd != null && pp != null) {
			p.setId(pd.getId());
			p.setName(pd.getName());
			price.setCurrency_code(pp.getCurrencyCode());
			price.setValue(pp.getPrice());
			p.setCurrent_price(price);
		}
		return p;
	}
	/**
	 * this method deletes product in product service and product price service
	 * @param id
	 * @return
	 */
	public String deleteProductById(Long id) {
		String productres = deleteProductDetailById(id);
		String productPriceRes = deleteProductPriceById(id);
		return productPriceRes;
	}
	
	public Product createProduct(Product product) {
		ProductDetail pd = new ProductDetail();
		ProductPrice pp = new ProductPrice();
		if(product != null) {
			pd.setId(product.getId());
			pd.setName(product.getName());
			
			// invoking product servie api to store new record
			pd = addProductDetail(pd);
			pp.setId(pd.getId());
			pp.setCurrencyCode(product.getCurrent_price().getCurrency_code());
			pp.setPrice(product.getCurrent_price().getValue());
			
			pp = addProductPrice(pp);
			product.setId(pp.getId());
		}
		return product;
	}
	
	public Product updateProduct(Product product) {
		ProductDetail pd = new ProductDetail();
		ProductPrice pp = new ProductPrice();
		if(product != null) {
			pd.setId(product.getId());
			pd.setName(product.getName());
			
			// invoking product servie api to store new record
			pd = updateProductDetail(pd);
			pp.setId(pd.getId());
			pp.setCurrencyCode(product.getCurrent_price().getCurrency_code());
			pp.setPrice(product.getCurrent_price().getValue());
			
			pp = updateProductPrice(pp);
			product.setId(pp.getId());
		}
		return product;
	}
}
