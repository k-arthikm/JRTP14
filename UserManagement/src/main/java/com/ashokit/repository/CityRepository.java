package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.City;

public interface CityRepository extends JpaRepository<City,Integer> {

}
