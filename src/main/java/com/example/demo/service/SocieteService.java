package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Societe1;
import com.example.demo.entity.Uti;
import com.example.demo.repository.SocieteRepository;

@Service
public class SocieteService {

@Autowired
private SocieteRepository RepSociete;

@Transactional
public Societe1 AjouterSociete(Societe1 s)
{
	return RepSociete.save(s);
	
}

@Transactional
public Societe1 ModifierSociete(Societe1 s)
{
	return RepSociete.save(s);
	
}

@Transactional
public void SupprimerSociete(Long id)
{
	Societe1 s= RepSociete.getById(id);
	 RepSociete.delete(s);
	
}

@Transactional
public List <Societe1> ListSociete()
{
	return RepSociete.findAll();
}

@Transactional
public Optional<Societe1> AfficherSociete( Long id) {
    return RepSociete.findById(id);
}

	
}
