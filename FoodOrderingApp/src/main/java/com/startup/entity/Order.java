package com.startup.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "ORDERS")
public class Order {
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private double total;
	private String customer;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private Set<OrderDetail> orderDetails=new HashSet<>();
	
//	public Order(Integer id, double total, String customer) {
//		this.id = id;
//		this.total = total;
//		this.customer = customer;
//		
//	}
	
	
public Order(Integer id,double total,String customer, OrderDetail...orderDetails) {
		//super();
		this.id = id;
		this.total = total;
		this.customer = customer;
		for(OrderDetail orderDetail:orderDetails ) orderDetail.setOrder(this);
		this.orderDetails=Stream.of(orderDetails).collect(Collectors.toSet());
		//this.orderDetails=orderDetails.setOrder(this);
		
		
	}


//	public Book(String name, BookPublisher... bookPublishers) {
//        this.name = name;
//        for(BookPublisher bookPublisher : bookPublishers) bookPublisher.setBook(this);
//        this.bookPublishers = Stream.of(bookPublishers).collect(Collectors.toSet());
//    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	public void addOrderDetails(OrderDetail orderDetail) {
		this.orderDetails.add(orderDetail);
	}


//	@Override
//	public String toString() {
//		return "Order [id=" + id + ", total=" + total + ", customer=" + customer + ", orderDetails=" + orderDetails
//				+ "]";
//	}
	
	
	
}
