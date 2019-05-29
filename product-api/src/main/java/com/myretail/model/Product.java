/**
 * 
 */
package com.myretail.model;

/**
 * @author thulasiram
 *
 */
public class Product {

	private Long id;
	private String name;
	private Price current_price;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the current_price
	 */
	public Price getCurrent_price() {
		return current_price;
	}

	/**
	 * @param current_price the current_price to set
	 */
	public void setCurrent_price(Price current_price) {
		this.current_price = current_price;
	}

	/**
	 * @param id
	 * @param name
	 * @param current_price
	 */
	public Product(Long id, String name, Price current_price) {
		super();
		this.id = id;
		this.name = name;
		this.current_price = current_price;
	}

	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

}
