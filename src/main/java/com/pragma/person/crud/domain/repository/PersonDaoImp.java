package com.pragma.person.crud.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragma.person.crud.domain.model.PersonEntity;

@Repository
public class PersonDaoImp implements PersonDao{

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Optional<PersonEntity> getPersonById(Long id) {
		return personRepository.findById(id);
	}

	@Override
	public Optional<PersonEntity> getPersonByTypeAndDocumentNumber(String docType, int documentNumber) {
		return Optional.of(Optional.of(personRepository.findByTypeAndDocumentNumber(docType, documentNumber)).orElse(null));
	}

	@Override
	public void addPersonToEntity(PersonEntity personEntity) {
		personRepository.save(personEntity);
		
	}

	@Override
	public void updatePersonFromEntity(Long id, PersonEntity personEntity1) {
		PersonEntity personFounded = personRepository.findById(id).orElseThrow(
				()-> new NoSuchElementException("Person wasn't found")
				);
		//personFounded.setFirstName(personEntity1.getFirstName());
	}

	@Override
	public void deletePersonByDocument(int documentNumber) {
		personRepository.deletePersonByDocumentNumber(documentNumber);
		
	}

	@Override
	public void deletePersonById(Long id) {
		personRepository.deleteById(id);
		
	}

	@Override
	public List<PersonEntity> getAllPeople() {
		return personRepository.findAll();
	}

	@Override
	public List<PersonEntity> searchByAgeRange(int ageBottom, int ageTop) {
		return personRepository.findByAgeRange(ageBottom, ageTop);
	}

	@Override
	public List<PersonEntity> searchByOldestAge(int age) {
		return personRepository.findByOldestAges(age);
	}

}
