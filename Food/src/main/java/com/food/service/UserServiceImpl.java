package com.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.entity.User;
import com.food.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository repository;
	
	
	@Override
	public User saveUser(User user) {
		return repository.save(user);
		
		
	}


	@Override
	public void deleteByUserById(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}


	@Override
	public User loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

//working code
//	@Override
//	public String login(User user) {
//		// TODO Auto-generated method stub
//		 User userFound=repository.loginCheck(user.getUsername(),user.getPassword() );
//		 
//		 if(userFound==null) {
//			 return "LoginFailed";
//		 }
//		 else {
//		 
//		 return "LoginSuccess";
//	}
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		 User userFound=repository.loginCheck(user.getUsername(),user.getPassword() );
	System.out.println("userFound:::::::::::::::::"+userFound);
		 if(userFound==null) {
			 return null;
		 }
		 else {
			 return userFound;
		 }

	
	
	
	

//	@Override
//	public User loginUser(String username, String password) {
//	User userExist = repository.loginCheck(username,password);
//		if(userExist==null) {
//			
//		}
//	}

}


@Override
public void updateUser(User user) {
	repository.save(user);
	
}


//	@Override
//	public void updateUserById(Integer id) {
//		
//		
//		
//	repository.save();
//	}
}
