/**
 * 
 */
package com.myretail.model;

/**
 * @author thulasiram
 *
 */
public class Price {
	private Double value;
	private String currency_code;
	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}
	/**
	 * @return the currency_code
	 */
	public String getCurrency_code() {
		return currency_code;
	}
	/**
	 * @param currency_code the currency_code to set
	 */
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	/**
	 * @param value
	 * @param currency_code
	 */
	public Price(Double value, String currency_code) {
		super();
		this.value = value;
		this.currency_code = currency_code;
	}
	
	public Price() {
		
	}

}
