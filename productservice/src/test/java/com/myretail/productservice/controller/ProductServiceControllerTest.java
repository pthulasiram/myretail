/**
 * 
 */
package com.myretail.productservice.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.myretail.productservice.TestUtils;
import com.myretail.productservice.entity.Product;
import com.myretail.productservice.service.ProductService;

/**
 * @author thulasiram
 *
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
public class ProductServiceControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	ProductService productService;
	private final String URL = "/api/product/";

	@Test
	public void testAddProduct() throws Exception {

		// prepare data and mock's behaviour
		Product empStub = new Product(1l, "Iphone XS MAX", 0l);
		when(productService.save(any(Product.class))).thenReturn(empStub);

		// execute
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post(URL).contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON_UTF8).content(TestUtils.objectToJson(empStub))).andReturn();

		// verify
		int status = result.getResponse().getStatus();
		assertEquals(HttpStatus.OK.value(), status, "Incorrect Response Status");

		// verify that service method was called once
		verify(productService).save(any(Product.class));

		Product resultEmployee = TestUtils.jsonToObject(result.getResponse().getContentAsString(), Product.class);
		assertNotNull(resultEmployee);
		assertEquals(1l, resultEmployee.getId().longValue());
	}
	
	@Test
	public void testupdateProduct() throws Exception {

		// prepare data and mock's behaviour
		Product empStub = new Product(1l, "Iphone X ", 0l);
		when(productService.save(any(Product.class))).thenReturn(empStub);

		// execute
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post(URL).contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON_UTF8).content(TestUtils.objectToJson(empStub))).andReturn();

		// verify
		int status = result.getResponse().getStatus();
		assertEquals(HttpStatus.OK.value(), status, "Incorrect Response Status");

		// verify that service method was called once
		verify(productService).save(any(Product.class));

		Product resultEmployee = TestUtils.jsonToObject(result.getResponse().getContentAsString(), Product.class);
		assertNotNull(resultEmployee);
		assertEquals(1l, resultEmployee.getId().longValue());
	}
}
