package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;

import org.springframework.core.io.InputStreamSource;
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
import com.example.demo.entity.Gestionnaire;
import com.example.demo.entity.Uti;
import com.example.demo.repository.GestionnaireRepository;
import com.example.demo.service.EmailService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Gestionnaire")
public class GestionnaireC {

	@Autowired
	private GestionnaireRepository gr ;
	@Autowired
	private EmailService s ;
	
	@GetMapping("/GETALLGestionnaire")
	public List<Gestionnaire>GetAllGestionnaire()
	{
		return gr.findAll();
	}
	
	@GetMapping("/GETGestionnaireById/{id}")
	public Optional<Gestionnaire> GetlUtilisateurById(@PathVariable Long id)
	{
		return gr.findById(id);
	}
	
	@DeleteMapping("/DELETEGestionnaire/{id}")
	public void DeleteGestionnaire(@PathVariable Long id)
	{
		gr.deleteById(id);
	}
	
	@PostMapping("/ADDGestionnaire")
	public Gestionnaire UpdateUtilisateur(@Validated @RequestBody Gestionnaire u) {
		try{  s.sendEmail( u.getEmail(), "Nouveau Gestionnaire ajouté", "Bonjour " + u.getNom() +" "+u.getPrenom()+
				 
				",\n\nNous avons le plaisir de vous avoir parmit notre équipe comme un." +" "+u.getRole()+
	               "\nvoici vos information de connexion." +
	               "\n matricule :"+u.getNcin()+
	               "\n mot de passe :"+u.getMdp()+
	               "\n \nNB : r => Gestionnaire RH."+
	               "\n \n p => Gestionnaire Paie."+
	               "\n \nBienvenue.");}
	        catch (MessagingException e) {

	            e.printStackTrace();
	        }
		return gr.save(u);
		
	}
	
	@PostMapping("/envoyer-rapport")
	  public void envoyerRapport(@Validated @RequestBody String pieceJointe ,Gestionnaire u) {
	    // Générer le fichier PDF à partir du rapport
		
		try{  s.sendEmail( u.getSuccursale().getSociete1().getDirecteur1().getEmail(), "Nouveau Rapport",
				"Bonjour " + u.getSuccursale().getSociete1().getDirecteur1().getNom() 
				+u.getSuccursale().getSociete1().getDirecteur1().getPrenom()+
	               ",\n\nNous avons rédiger un rapport bie détailés de notre succursale " +
	               "\nvoici vos information de connexion." +
	               u.getSuccursale().getNom_succursale()+pieceJointe
	               );}
	        catch (MessagingException e) {

	            e.printStackTrace();
	        }
		}
	
}
