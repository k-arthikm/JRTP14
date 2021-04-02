package com.food.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String role;
	private String name;
	private String password;
	private String username;
	private String email;
	private Long mobile;
	private String address;
	private Integer verified;
	private Integer deleted;
	
	@OneToMany(targetEntity=Order.class,cascade=CascadeType.ALL)
	@JoinColumn(name="custid_fk",referencedColumnName="id")
	private List<Order> orders;
	

	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getVerified() {
		return verified;
	}
	public void setVerified(Integer verified) {
		this.verified = verified;
	}
	public void setUsername(String username) {
		this.username = username;
	}
 
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}
