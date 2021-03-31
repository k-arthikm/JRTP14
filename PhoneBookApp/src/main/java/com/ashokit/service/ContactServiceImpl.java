package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.entity.Contact;
import com.ashokit.repository.ContactRepository;

public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepository repository;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		Contact savedObj=repository.save(contact);
		
		if(savedObj.getId()!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Contact> contactById=repository.findById(id);
		
		if(contactById.isPresent()) {
			return contactById.get();
			
		}else {
			return null;
		}
	}

	@Override
	public boolean deleteContact(Integer id) {
		// TODO Auto-generated method stub
		
		boolean isDeleted=false;
		try{
			repository.deleteById(id);
			isDeleted =true;
		}
		catch(Exception e) {
			
		}
		return isDeleted;
	}




}
