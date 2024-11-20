package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Uti;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.service.EmailService;
import com.example.demo.service.UtilisateurService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {

	@Autowired	
	private UtilisateurService Uservice;
	@Autowired
	private UtilisateurRepository us;
	
	@Autowired
	private EmailService s ;
	
	@PostMapping("/ADDUtilisateur")
	public Uti AddUtilisateur(@Validated @RequestBody Uti u) {
		try{  s.sendEmail( u.getEmail_Utilisateur(), "Nouveau Employé ajouté", "Bonjour " + u.getNom_Utilisateur() +" " +u.getPrenom_Utilisateur()+
				",\n\nNous avons le plaisir de vous avoir parmit nos employé." +
	               "\nvoici vos information de connexion." +
	               "\n matricule :"+u.getMat_Utilisateur()+
	               "\n mot de passe :"+u.getMdp_Utilisateur()+
	               "\n \nBienvenue.");}
	        catch (MessagingException e) {

	            e.printStackTrace();
	        }

		return Uservice.AjouterUtilisateur(u);
		
	}
	
	@PostMapping("/UPDATEUtilisateur")
	public Uti UpdateUtilisateur(@Validated @RequestBody Uti u) {
		return Uservice.AjouterUtilisateur(u);
		
	}
	
	@DeleteMapping("/DELETEUtilisateur/{id}")
	public void DeleteUtilisateur(@PathVariable Long id)
	{
		Uservice.SupprimerUtilisateur(id);
	}
	
	@GetMapping("/GETALLUtilisateur")
	public List<Uti>GetAllUtilisateur()
	{
		return Uservice.ListUtilisateur();
	}
	
	@GetMapping("/GETUtilisateurById/{id}")
	public Optional<Uti> GetlUtilisateurById(@PathVariable Long id)
	{
		return Uservice.AfficherUtilisateur(id); 
	}
	
	
	
	@PostMapping("/Envoyer")
	public void envoyer(@Validated @RequestBody Uti u) {
		try{  s.sendEmail( u.getEmail_Utilisateur(), "Mot de passe oublié", "Bonjour " + u.getNom_Utilisateur() +" "+u.getPrenom_Utilisateur()+
	               ",\n\nNous avons recu une demande de récupération du mot de passe de votre compte" +
	               "\n voici votre mot de passe de connexion." +
	               "\n mot de passe :"+u.getMdp_Utilisateur()+
	               "\n \nBienvenue.");}
	        catch (MessagingException e) {

	            e.printStackTrace();
	        }
				
	}
	

	
	 
}
