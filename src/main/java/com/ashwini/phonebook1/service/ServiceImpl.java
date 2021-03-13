package com.ashwini.phonebook1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashwini.phonebook1.bean.Contact;
import com.ashwini.phonebook1.entity.ContactEntity;
import com.ashwini.phonebook1.repo.ContactRepository;

public class ServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(contact, entity);
		ContactEntity savedEntity = contactRepo.save(entity);
		if (savedEntity != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		List<ContactEntity> entity = contactRepo.findAll();
		List<Contact> contacts = new ArrayList<>();

		for (ContactEntity contactEntity : entity) {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			contacts.add(contact);
		}

		return contacts;
	}

	@Override
	public Contact getContactById(Integer id) {
		ContactEntity entity = null;
		Optional<ContactEntity> findById = contactRepo.findById(id);
		if (findById.isPresent()) {
			entity = findById.get();
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}
		return null;
	}

}
