package com.example.demo.controller;

import java.util.List;

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

import com.example.demo.entity.ClePret;
import com.example.demo.entity.Pret;
import com.example.demo.entity.mensualitePret;
import com.example.demo.repository.MensualitePretRepository;
import com.example.demo.service.PretService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/MensualitePret")
public class MensualiteController {
	
	@Autowired
	private  MensualitePretRepository mp;
	
	@PostMapping("/ADDMensualitePret")
	public mensualitePret AddPret(@Validated @RequestBody mensualitePret p) {
		return mp.save(p);
		
	}
	

	@DeleteMapping("/DELETEMensualitePret/{id}")
	public void DeletePret(@PathVariable ClePret id)
	{
		mp.deleteById(id);
	}
	
	@GetMapping("/GETALLMensualitePret")
	public List<mensualitePret>GetAllPret()
	{
		return mp.findAll();
	}

}
