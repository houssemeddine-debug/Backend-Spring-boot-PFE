package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Uti;
import com.example.demo.repository.UtilisateurRepository;


@Service
public class UtilisateurService {

@Autowired
private UtilisateurRepository RepUtilisateur;

@Transactional
public Uti AjouterUtilisateur(Uti u)
{
	return RepUtilisateur.save(u);
	
}

@Transactional
public Uti ModifierUtilisateur(Uti u)
{
	return RepUtilisateur.save(u);
	
}

@Transactional
public void SupprimerUtilisateur(Long id)
{
	Uti u= RepUtilisateur.getById(id);
	 RepUtilisateur.delete(u);
	
}

@Transactional
public List <Uti> ListUtilisateur()
{
	return RepUtilisateur.findAll();
}

@Transactional
public Optional<Uti> AfficherUtilisateur( Long id) {
    return RepUtilisateur.findById(id);
}


}

	