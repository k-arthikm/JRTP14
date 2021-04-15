package com.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
