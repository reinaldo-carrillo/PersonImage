package com.pragma.person.crud.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pragma.person.crud.domain.model.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long>{

	PersonEntity findByDocumentNumber (int documentNumber);
	//@Transactional
	@Modifying
	@Query(value="SELECT * FROM buyer_tbl AS p WHERE p.cod_doc_type = ?1 AND p.document_number = ?2", nativeQuery = true)
	PersonEntity findByTypeAndDocumentNumber (String docType, int documentNumber);
	//@Transactional
	@Modifying
	@Query(value="SELECT * FROM buyer_tbl AS p WHERE p.age >= ?1 AND p.age <= ?2", nativeQuery = true)
	List<PersonEntity> findByAgeRange(int ageBottom, int ageTop);
	//@Transactional
	@Modifying
	@Query(value="SELECT * FROM buyer_tbl AS p WHERE p.age >= ?1", nativeQuery = true)
	List<PersonEntity> findByOldestAges(int age);
	@Transactional
	@Modifying
	@Query(value="DELETE FROM buyer_tbl AS p WHERE p.document_number = ?1", nativeQuery = true)
	void deletePersonByDocumentNumber(int documentNumber);
	
}
