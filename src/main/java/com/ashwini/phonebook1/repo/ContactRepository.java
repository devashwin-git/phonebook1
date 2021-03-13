package com.ashwini.phonebook1.repo;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwini.phonebook1.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Serializable> {

	ContactEntity save(ContactEntity contact);

	boolean updateContact(ContactEntity contactEntity);

	boolean deleteById(Integer id);

	List<ContactEntity> findAll();

	Optional<ContactEntity> findById(Integer id);
}
