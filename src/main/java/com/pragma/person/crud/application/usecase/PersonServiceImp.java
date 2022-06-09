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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean erasePersonById(Long idPerson) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean erasePersonByDocumentNumber(int documentNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PersonEntity> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonEntity> lookForByAgeRange(int ageBottom, int ageTop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonEntity> lookForByOldestAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

}
