package com.pragma.person.crud.Infraestructure.endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragma.person.crud.application.usecase.PersonService;
import com.pragma.person.crud.domain.model.PersonEntity;

@RestController
@RequestMapping("/people/read")
public class PersonControllerRead {

	@Autowired
	PersonService personService;
	
	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PersonEntity> getAll (){
		return personService.readAll();
	}
}
