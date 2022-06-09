package com.pragma.person.crud.application.usecase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragma.person.crud.domain.model.PersonEntity;
import com.pragma.person.crud.domain.repository.PersonDao;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Override
	public boolean addPerson(PersonEntity personEntity) {
		if(personDao.getPersonById(personEntity.getId())== null) {
			personDao.addPersonToEntity(personEntity);
			return true;
		}
		return false;
	}

	@Override
	public Optional<PersonEntity> readPersonById(Long idPerson) {
		return personDao.getPersonById(idPerson);
	}

	@Override
	public Optional<PersonEntity> readfPersonByTypeAndDocumentNumber(String docType, int documentNumber) {
		return personDao.getPersonByTypeAndDocumentNumber(docType, documentNumber);
	}

	@Override
	public boolean updatePerson(PersonEntity personEntity) {
		if(personDao.getPersonById(personEntity.getId())!= null) {
			personDao.addPersonToEntity(personEntity);
			return true;
		}
		return false;
	}

	@Override
	public boolean erasePersonById(Long idPerson) {
		if(personDao.getPersonById(idPerson)!= null) {
			personDao.deletePersonById(idPerson);
			return true;
		}
		return false;
	}

	@Override
	public boolean erasePersonByDocumentNumber(int documentNumber) {
		if(personDao.getPersonByDocumentNumber(documentNumber)!= null) {
			personDao.deletePersonByDocument(documentNumber);
			return true;
		}
		return false;
	}

	@Override
	public List<PersonEntity> readAll() {
		return personDao.getAllPeople();
	}

	@Override
	public List<PersonEntity> lookForByAgeRange(int ageBottom, int ageTop) {
		return personDao.searchByAgeRange(ageBottom, ageTop);
	}

	@Override
	public List<PersonEntity> lookForByOldestAge(int age) {
		return personDao.searchByOldestAge(age);
	}

	@Override
	public PersonEntity readfPersonByDocumentNumber(int documentNumber) {
		return personDao.getPersonByDocumentNumber(documentNumber);
	}

}
