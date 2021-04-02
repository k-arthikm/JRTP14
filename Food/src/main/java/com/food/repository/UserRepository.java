package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.food.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	@Query("select u from User u where username=?1 and password=?2")
	User loginCheck(String username, String password);

}
