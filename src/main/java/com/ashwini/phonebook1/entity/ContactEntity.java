package com.ashwini.phonebook1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Entity
@Table(name="std_dtls")
@Data
public class ContactEntity {
	@Id
	/*
	 * @SequenceGenerator(name = "")
	 * 
	 * @GeneratedValue
	 */
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="mobile")
	private long mobile;
	
	@Column(name="createdDate", updatable =false)
	@CreationTimestamp
	@Temporal(value = TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="updatedDate",insertable = false)
	@UpdateTimestamp
	@Temporal(value = TemporalType.DATE)
	private Date updatedDate;
}
