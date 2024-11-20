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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Societe1;
import com.example.demo.service.SocieteService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Societe")
public class SocieteController {

	@Autowired
	private SocieteService Sosservice;
	
	@PostMapping("/ADDSociete")
	public Societe1 AddSociete(@Validated @RequestBody Societe1 s) {
		return Sosservice.AjouterSociete(s);
		
	}
	
	@PostMapping("/UPDATESociete")
	public Societe1 UpdateSociete(@Validated @RequestBody Societe1 s) {
		return Sosservice.AjouterSociete(s);
		
	}
	
	@DeleteMapping("/DELETESociete/{id}")
	public void DeleteSociete(@PathVariable Long id)
	{
		Sosservice.SupprimerSociete(id);
	}
	
	@GetMapping("/GETALLSociete")
	public List<Societe1>GetAllSociete()
	{
		return Sosservice.ListSociete();
	}
	
	@GetMapping("/GETSocieteById/{id}")
	public Optional<Societe1> GetlSocieteById(@PathVariable Long id)
	{
		return Sosservice.AfficherSociete(id); 
	}
	
}
