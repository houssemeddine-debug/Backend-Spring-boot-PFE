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


import com.example.demo.entity.Succursale1;
import com.example.demo.service.SuccursaleService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Succursale") 
public class SuccursaleController {

	@Autowired
	private SuccursaleService Sucservice;
	
	@PostMapping("/ADDSuccursale")
	public Succursale1 AddSuccursale(@Validated @RequestBody Succursale1 suc) {
		return Sucservice.AjouterSuccursale(suc);
		
	}
	
	@PostMapping("/UPDATESuccursale")
	public Succursale1 UpdateSuccursale(@Validated @RequestBody Succursale1 suc) {
		return Sucservice.AjouterSuccursale(suc);
		
	}
	
	@DeleteMapping("/DELETESuccursale/{id}")
	public void DeleteSuccursale(@PathVariable Long id)
	{
		Sucservice.SupprimerSuccursale(id);
	}
	
	@GetMapping("/GETALLSuccursale")
	public List<Succursale1>GetAllSuccursale()
	{
		return Sucservice.ListSuccursale();
	}
	
	@GetMapping("/GETSuccursaleById/{id}")
	public Optional<Succursale1> GetlSuccursaleById(@PathVariable Long id)
	{
		return Sucservice.AfficherSuccursale(id); 
	}
	
}
