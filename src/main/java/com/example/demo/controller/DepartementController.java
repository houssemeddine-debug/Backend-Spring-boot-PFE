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

import com.example.demo.entity.Departement;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.service.DepartementService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Departement")
public class DepartementController {

	@Autowired
	private DepartementService Dservice;
	@Autowired
	private DepartementRepository dr ;
	
	@PostMapping("/ADDDepartement")
	public Departement AddDepartement(@Validated @RequestBody Departement d) {
		return Dservice.AjouterDepartement(d);
		
	}
	
	@PostMapping("/UPDATEDepartement")
	public Departement UpdateDepartement(@Validated @RequestBody Departement d) {
		return Dservice.AjouterDepartement(d);
		
	}
	
	@DeleteMapping("/DELETEDepartement/{id}")
	public void DeleteDepartement(@PathVariable Long id)
	{
		Dservice.SupprimerDepartement(id);
	}
	
	@DeleteMapping("/DELETEDepartementS/{id}")
	public void DeleteDepartementS(@PathVariable Long id)
	{
		Dservice.SupprimerDepartement(id);
	}
	
	@GetMapping("/GETALLDepartement")
	public List<Departement>GetAllDepartement()
	{
		return Dservice.ListDepartement();
	}
	
	@GetMapping("/GETDepartementById/{id}")
	public Optional<Departement> GetlDepartementById(@PathVariable Long id)
	{
		return Dservice.AfficherDepartement(id); 
	}
	
	
	
}
