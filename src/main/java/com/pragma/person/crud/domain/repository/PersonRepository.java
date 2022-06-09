package com.pragma.person.crud.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pragma.person.crud.domain.model.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long>{

	@Transactional
	@Modifying
	@Query("SELECT * FROM buyer_tbl p WHERE p.cod_doc_type = ?1 AND p.document_number = ?2 ")
	PersonEntity findByTypeAndDocumentNumber (String docType, int documentNumber);
	@Transactional
	@Modifying
	@Query("SELECT * FROM buyer_tbl p WHERE p.age >= ?1 AND p.age <= ?2 ")
	PersonEntity findByAgeRange(int numberBottom, int numberTop);
	@Transactional
	@Modifying
	@Query("SELECT * FROM buyer_tbl p WHERE p.age >= ?1")
	PersonEntity findByAgeAdult(int age);
	
}
