package com.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

}
