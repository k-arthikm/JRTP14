package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.food.entity.Order;
import com.food.entity.User;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	


}
