package com.startup.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetail {

	@Id
	@Column(name = "order_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	private int quantity;
	private float subtotal;

	public Integer getId() {
		return id;
	}

	public OrderDetail(Integer id, Item item, Order order, int quantity, float subtotal) {
		this.id = id;
		this.item = item;
		this.order = order;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public OrderDetail(Set<OrderDetail> orderDetails) {
		// TODO Auto-generated constructor stub
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", item=" + item + ", order=" + order + ", quantity=" + quantity
				+ ", subtotal=" + subtotal + "]";
	}
	
	
	
	
}
