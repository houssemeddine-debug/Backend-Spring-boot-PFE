package com.example.demo.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Avertissement;
import com.example.demo.service.AvertissementService;
import com.example.demo.service.EmailService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Avertissement")
public class AvertissementController {
	
	@Autowired
	private AvertissementService as ;
	@Autowired
	private EmailService s ;

	@PostMapping("/ADDAvertissement")
	public Avertissement AddAvertissement(@Validated @RequestBody Avertissement a) {
		try{  s.sendEmail( a.getUtilisateur().getEmail_Utilisateur(), "Nouveau Avertissement", "/n" + a.getContenu_avertissement() +
                 "\n \nCordialement.");}
	        catch (MessagingException e) {

	            e.printStackTrace();
        }		
	return as.AjouterAvertissement(a);
	}
	
	@GetMapping("/GETALLAvertissement")
	public List<Avertissement>GetAllAvertissement()
	{
		return as.ListAvertissement();
	}
}
