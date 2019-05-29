package com.myretail.model;

/**
 * @author thulasiram
 *
 */

public class ProductDetail {
	private Long id;
	private String name;
	private Long version;

	public ProductDetail() {

	}

	public ProductDetail(Long id, String name, Long version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
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
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

}
