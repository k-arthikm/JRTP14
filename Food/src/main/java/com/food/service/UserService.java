package com.food.service;

import com.food.entity.User;

public interface UserService {

	User saveUser(User user);

	void deleteByUserById(Integer id);

	User loginUser(String username, String password);

	User login(User user);

	//void updateUserById(Integer id);

	void updateUser(User user);

}
