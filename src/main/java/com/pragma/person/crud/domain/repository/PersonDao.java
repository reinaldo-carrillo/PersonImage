package com.pragma.person.crud.domain.repository;

import java.util.List;
import java.util.Optional;

import com.pragma.person.crud.domain.model.PersonEntity;

public interface PersonDao {

	Optional<PersonEntity> getPersonById (Long id);
	Optional<PersonEntity> getPersonByTypeAndDocumentNumber (String docType, int documentNumber);
	PersonEntity getPersonByDocumentNumber (int documentNumber);
	void addPersonToEntity (PersonEntity personEntity);
	void updatePersonFromEntity (Long id, PersonEntity personEntity);
	void deletePersonByDocument (int documentNumber);
	void deletePersonById (Long id);
	List<PersonEntity> getAllPeople ();
	List<PersonEntity> searchByAgeRange (int ageBottom, int ageTop);
	List<PersonEntity> searchByOldestAge (int age);
	
}
