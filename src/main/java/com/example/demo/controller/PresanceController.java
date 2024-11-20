package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Presanse;
import com.example.demo.repository.PresanceRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Presance")
public class PresanceController {
	
	@Autowired
	private PresanceRepository pr ;

	@PostMapping("/ADDPresance")
	public Presanse AddPresance(@Validated @RequestBody Presanse p) {
		return pr.save(p);
	}
	
	@GetMapping("/GETALLPresance")
	public List<Presanse>GetAllPresance()
	{
		return pr.findAll();
	}

}
