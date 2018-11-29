package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IClientRepository;
import com.example.demo.entities.Client;




@RestController
public class ImplementationService {
	@Autowired
	private IClientRepository clientRepository;
	
	@RequestMapping("/save")
	public Client saveClient(Client p) {
		
		clientRepository.save(p);
		return p ;
	}
	
	
	@RequestMapping("/all")
	public List <Client> getClient(){
		
		
		return clientRepository.findAll();
		
	}


	@RequestMapping("/clients")

	public Page <Client> getClient(int page){

		
	return clientRepository.findAll( PageRequest.of(0, 3));	
	}
	
	
	/*@RequestMapping("/clientparDate")
	public Page<Client> getClient(String mc,int page){
		return clientRepository.produitParDate("%"+mc+"%",PageRequest.of(0, 3));
			
	}*/
	
	@RequestMapping("/delete")
	public boolean delete(Long ref) {
		clientRepository.deleteById(ref);
		return true;
	}
	
	@RequestMapping("get")
	public Optional<Client> getClient(Long ref) {
		return clientRepository.findById(ref);
	}
	
	@RequestMapping("update")
	public Client update(Client p) {
		clientRepository.save(p);
		return p;
	}
}
