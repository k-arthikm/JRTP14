package com.ashokit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.entity.Country;
import com.ashokit.entity.User;
import com.ashokit.repository.CountryRepository;
import com.ashokit.repository.UserRepository;

public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CountryRepository countryRepository;
	@Override
	public String loginCheck(String email, String pwd) {
		
		
		User user=userRepository.findByEmailAndPwd(email, pwd);
		         
		
		if(user!=null&&user.getAcct_status()=="Unlocked") {
			return "credentials are valid and account is unlocked";
		}else {
			return "credentials are Invalid and account is locked";
		}
	}

	@Override
	public Map<Integer, String> getCountries() {
		// TODO Auto-generated method stub
		
		List<Country> countryList=countryRepository.findAll();
		Map<Integer, String> map = new HashMap<>();
		
		for (Country country : countryList) {
            map.put(country.getCountryId(), country.getCountryName());
        }
		
		
		
		return map;
	}

}
