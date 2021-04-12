package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	@Query("select u from User u where u.email=?1 and u.pwd=?2")
	User findByEmailAndPwd(String email,String pwd);

}
