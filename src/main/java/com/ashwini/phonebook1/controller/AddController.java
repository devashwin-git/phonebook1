package com.ashwini.phonebook1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashwini.phonebook1.bean.Contact;
import com.ashwini.phonebook1.service.ContactService;

@Controller
public class AddController {
	@Autowired
	private ContactService service;

	@GetMapping(value = { "/", "/addcontact" })
	String loadFrom(Model model) {

		Contact contact = new Contact();
		model.addAttribute(contact);
		return "addContact";

	}

	@PostMapping("/addContact")
	String handleSubmit(Contact contact, RedirectAttributes redirect) {
		boolean saveContact = service.saveContact(contact);
		if (saveContact)
			redirect.addFlashAttribute("succ_msg", "Thankyou for Registering with us");
		// model.addAttribute("succ_msg","Thankyou for Registering with us");
		else
			redirect.addFlashAttribute("fail_msg", "Please Try again");

		// model.addAttribute("fail_msg","Please Try again");
		return "redirect/addContactSuccess";
		// return "addContact";
	}

	
	//solving Double Posting Problem
	@GetMapping("/addContactSuccess")
	String loadForm1(Model model) {
		Contact contact = new Contact();
		model.addAttribute(contact);
		return "addContact";
	}

	@GetMapping("/viewcontacts")
	String handleView(Model model) {
		List<Contact> contacts = service.getAllContact();
		model.addAttribute("contact", contacts);
		return "ViewContact";
	}

}
