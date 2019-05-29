package com.myretail.model;

/**
 * @author thulasiram
 *
 */

public class ProductPrice {

	private Long id;
	private Double price;
	private String currencyCode;

	/**
	 * Default constructor used to create PRODUCT entity object
	 */
	public ProductPrice() {

	}

	/**
	 * Constructor to create Product object with all values
	 * 
	 * @param id
	 * @param price
	 * @param countryCode
	 */
	public ProductPrice(Long id, Double price, String countryCode) {
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
