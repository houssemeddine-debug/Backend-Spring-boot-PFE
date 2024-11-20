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

import com.example.demo.entity.Pret;
import com.example.demo.service.PretService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Pret")
public class PretController {

	@Autowired
	private PretService Pservice;
	
	@PostMapping("/ADDPret")
	public Pret AddPret(@Validated @RequestBody Pret p) {
		return Pservice.AjouterPret(p);
		
	}
	
	@PostMapping("/UPDATEPret")
	public Pret UpdatePret(@Validated @RequestBody Pret p) {
		return Pservice.AjouterPret(p);
		
	}
	
	@DeleteMapping("/DELETEPret/{id}")
	public void DeletePret(@PathVariable Long id)
	{
		Pservice.SupprimerPret(id);
	}
	
	@GetMapping("/GETALLPret")
	public List<Pret>GetAllPret()
	{
		return Pservice.ListPret();
	}
	
	@GetMapping("/GETPretById/{id}")
	public Optional<Pret> GetlPretById(@PathVariable Long id)
	{
		return Pservice.AfficherPret(id); 
	}
	
}
