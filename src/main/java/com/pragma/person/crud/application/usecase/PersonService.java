package com.pragma.person.crud.application.usecase;

import java.util.List;
import java.util.Optional;

import com.pragma.person.crud.domain.model.PersonEntity;

public interface PersonService {

	boolean addPerson(PersonEntity personEntity);
	Optional<PersonEntity> readPersonById(Long idPerson);
	Optional<PersonEntity> readfPersonByTypeAndDocumentNumber(String docType, int documentNumber);
	boolean updatePerson (PersonEntity personEntity);
	boolean erasePersonById (Long idPerson);
	boolean erasePersonByDocumentNumber (int documentNumber);
	List<PersonEntity> readAll ();
	List<PersonEntity> lookForByAgeRange (int ageBottom, int ageTop);
	List<PersonEntity> lookForByOldestAge (int age);
	
	
}
