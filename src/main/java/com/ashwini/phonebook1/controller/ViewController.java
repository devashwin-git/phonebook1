package com.ashwini.phonebook1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.ashwini.phonebook1.bean.Contact;
import com.ashwini.phonebook1.service.ContactService;

public class ViewController {
	
	@Autowired
	private ContactService service;

	void handleDelete(Integer id, Model model) {
	}

	String handelEdit(Integer id, Model model) {
		Contact contactById = service.getContactById(id);
		model.addAttribute("contact", contactById);
		return "addContact";
	}

	String handleAddBtn(Model model) {
		Contact c=new Contact();
		model.addAttribute(c);
		return "addContact";
	}
}