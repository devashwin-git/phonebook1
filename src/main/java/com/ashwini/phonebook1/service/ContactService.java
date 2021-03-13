package com.ashwini.phonebook1.service;

import java.util.List;

import com.ashwini.phonebook1.bean.Contact;

public interface ContactService {

	boolean saveContact(Contact contact);

	boolean updateContact(Contact contact);

	boolean deleteContact(Integer id);

	List<Contact> getAllContact();

	Contact getContactById(Integer id);
}
