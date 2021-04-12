package com.ashokit.service;

import java.util.Map;

public interface UserManagementService {
	
	public String loginCheck(String email,String pwd);
	
	public Map<Integer,String> getCountries();

}
