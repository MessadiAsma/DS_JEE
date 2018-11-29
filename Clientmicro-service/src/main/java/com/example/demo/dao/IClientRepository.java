package com.example.demo.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Client;

public interface IClientRepository extends MongoRepository<Client, Long>{
	
	/*@Query("select c from Client c where c.dateNaissance like:x")
	public Page<Client>produitParDate(@Param("x")String mc, Pageable p);*/
		
	public List<Client>	findByDateNaissance(String date);

	public Page<Client> findByDateNaissance(String date, Pageable p);

}
