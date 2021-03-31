package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.entity.Contact;

@Service
public interface ContactService {

	//void getContactForm(Contact contact);

	boolean saveContact(Contact contact);

	List<Contact> getAllContacts();

	//Contact editContact(Contact contact);
	
	Contact getContactById(Integer id);

	//void saveExistingContact(Contact contact);

	boolean deleteContact(Integer id);
	
	

}
