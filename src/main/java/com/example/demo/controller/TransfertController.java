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
import com.example.demo.entity.Transfert;
import com.example.demo.repository.TransfetRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Transfert")
public class TransfertController {

	@Autowired
	private TransfetRepository tr ;
	
	@PostMapping("/ADDTransfert")
	public Transfert AddTransfert(@Validated @RequestBody Transfert t) {
		return tr.save(t);
		
	}
	
	@PostMapping("/UPDATETransfert")
	public Transfert UpdateTransfert(@Validated @RequestBody Transfert t) {
		return tr.save(t);
		
	}
	
	@DeleteMapping("/DELETETransfert/{id}")
	public void DeleteTransfert(@PathVariable Long id)
	{
		tr.deleteById(id);
	}
	
	@GetMapping("/GETALLTransfert")
	public List<Transfert>GetAllTransfert()
	{
		return tr.findAll();
	}
	
	@GetMapping("/GETTransfertById/{id}")
	public Optional<Transfert> GetlTransfertById(@PathVariable Long id)
	{
		return tr.findById(id); 
	}
}
