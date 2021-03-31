package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_DETAILS")
public class Contact {

	@Id
	@Column(name = "CONTACT_ID")
	private Integer id;
	@Column(name = "CONTACT_NAME")
	private String name;
    @Column(name = "CONTACT_EMAIL")
	private String email;
	@Column(name = "CONTACT_NUMBER")
	private Long number;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	
	

}
