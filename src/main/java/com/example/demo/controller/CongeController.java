package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Conge;
import com.example.demo.repository.CongeRepository;
import com.example.demo.service.CongeService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Conge")
public class CongeController {

	@Autowired
	private CongeService Cservice;

	@Autowired
	private CongeRepository RepConge ;
	
	@PostMapping("/ADDConge")
	public Conge AddConge(@Validated @RequestBody Conge c) {
		return Cservice.AjouterConge(c);
		
	}
	
	@PutMapping("/UPDATEConge/{id}")
	public Conge UpdateConge(@Validated @RequestBody Long id, @Validated @RequestBody Conge co) {
		 co= RepConge.getById(id);
		 co.setRole("f");
		return RepConge.save(co);
		
	}
	
	@DeleteMapping("/DELETEConge/{id}")
	public void DeleteConge(@PathVariable Long id)
	{
		Cservice.SupprimerConge(id);
	}
	
	@GetMapping("/GETALLConge")
	public List<Conge>GetAllConge()
	{
		return Cservice.ListConge();
	}
	
	@GetMapping("/GETCongeById/{id}")
	public Optional<Conge> GetlCongeById(@PathVariable Long id)
	{
		return Cservice.AfficherConge(id); 
	}
	
	
	
}
