package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entity.User;
import com.food.service.UserService;



@RestController
@RequestMapping(path = "/food")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping(path = "/addUser")
	public void saveUser(@RequestBody User user) {

		service.saveUser(user);
		
	}
	
	@PostMapping(path = "/deleteUser/{id}")
	public void deleteUser(@PathVariable Integer id ) {
		

		service.deleteByUserById(id);
	}
	
	//updateUser
	@PutMapping(path = "/updateUser")
	public void updateUser(@RequestBody User user ) {
		

		service.updateUser(user);
	}
	
	
	
//	@PostMapping(path = "/login")
//	public String loginUser(@RequestBody User user) {
//		
//
//		//return service.loginUser(user.getUsername(),user.getPassword());
//	}
	
//	
//	@PostMapping(path = "/login")
//	public String login(@RequestBody User user) {
//
//		User user=service.login(user);
//		
//		
//	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<User> login(@RequestBody User user) {

		User loggedUser=service.login(user);
		
		return new ResponseEntity<User>(loggedUser, HttpStatus.OK);
	}
	
	@PostMapping("/placeOrder")
	public User placeOrder(@RequestBody User user) {
		
		return service.saveUser(user);
	}
	
	
	
	
	
	
	
	
	
	


}
