package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;

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

import com.example.demo.entity.Directeur1;
import com.example.demo.entity.Formation;
import com.example.demo.entity.Uti;
import com.example.demo.repository.DirecteurRepository;
import com.example.demo.service.EmailService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Directeur")
public class DirecteurC {
	
	@Autowired
	private DirecteurRepository dr ;
	@Autowired
	private EmailService s ;
	
	@GetMapping("/GETALLDirecteur")
	public List<Directeur1>GetAllFormation()
	{
		return dr.findAll();
	}
	
	@GetMapping("/GETDirecteurById/{id}")
	public Optional<Directeur1> GetlUtilisateurById(@PathVariable Long id)
	{
		return dr.findById(id); 
	}
	
	
	
	@PostMapping("/ADDDirecteur")
	public Directeur1 UpdateUtilisateur(@Validated @RequestBody Directeur1 u) {
		return dr.save(u);
		
	}
	
	@DeleteMapping("/DELETEDirecteur/{id}")
	public void DeleteUtilisateur(@PathVariable Long id)
	{
		dr.deleteById(id);
	}
	
	
	@PostMapping("/Envoyer")
	public void envoyer(@Validated @RequestBody Directeur1 u) {
		try{  s.sendEmail( u.getEmail(), "Mot de passe oublié", "Bonjour " + u.getNom() +"  "+u.getPrenom()+
	               ",\n\nNous avons reçu une demande de récupération du mot de passe de votre compte" +
	               "\n voici votre mot de passe de connexion." +
	               "\n mot de passe :"+u.getMdp()+
	               "\n \nBienvenue.");}
	        catch (MessagingException e) {

	            e.printStackTrace();
	        }
				
	}
}
