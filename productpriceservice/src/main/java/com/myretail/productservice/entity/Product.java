/**
 * 
 */
package com.myretail.productservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author thulasiram
 *
 */
@Entity(name = "PRODUCT_PRICE")
public class Product {
	@Id
	@Column(name = "PRODUCT_ID")
	private Long id;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "currency_code")
	private String currencyCode;

	/**
	 * Default constructor used to create PRODUCT entity object
	 */
	public Product() {

	}

	/**
	 * Constructor to create Product object with all values
	 * 
	 * @param id
	 * @param price
	 * @param countryCode
	 */
	public Product(Long id, Double price, String currencyCode) {
		super();
		this.id = id;
		this.price = price;
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param countryCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
