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

import com.example.demo.entity.Formation;
import com.example.demo.service.FormationService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Formation")
public class FormationController {

	@Autowired
	private FormationService Fservice;
	
	@PostMapping("/ADDFormation")
	public Formation AddFormation(@Validated @RequestBody Formation f) {
		return Fservice.AjouterFormation(f);
		
	}
	
	@PostMapping("/UPDATEFormation")
	public Formation UpdateFormation(@Validated @RequestBody Formation f) {
		return Fservice.AjouterFormation(f);
		
	}
	
	@DeleteMapping("/DELETEFormation/{id}")
	public void DeleteFormation(@PathVariable Long id)
	{
		Fservice.SupprimerFormation(id);
	}
	
	@GetMapping("/GETALLFormation")
	public List<Formation>GetAllFormation()
	{
		return Fservice.ListFormation();
	}
	
	@GetMapping("/GETFormationById/{id}")
	public Optional<Formation> GetlFormationById(@PathVariable Long id)
	{
		return Fservice.AfficherFormation(id); 
	}
	
}
