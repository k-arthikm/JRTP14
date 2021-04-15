package com.startup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	

}
