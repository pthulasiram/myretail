/**
 * 
 */
package com.myretail.productservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author thulasiram
 *
 */
@SequenceGenerator(name = "PRODUCT_SEQ", initialValue = 10000, allocationSize = 25)
@Entity(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue(generator = "PRODUCT_SEQ", strategy = GenerationType.SEQUENCE)
	@Column(name = "PRODUCT_ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "VERSION")
	private Long version;

	public Product() {

	}

	public Product(Long id, String name, Long version) {
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
