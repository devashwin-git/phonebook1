package com.ashwini.phonebook1.bean;

import java.util.Date;

import lombok.Data;
@Data
public class Contact {
	
	
private Integer id;
	
	private String name;
	private String email;
	private String address;
	private long mobile;
	
	private Date createdDate;
	private Date updatedDate;

}
