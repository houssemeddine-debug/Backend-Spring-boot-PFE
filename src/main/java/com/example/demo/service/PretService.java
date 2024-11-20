package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Pret;
import com.example.demo.entity.Uti;
import com.example.demo.repository.PretRepository;

@Service
public class PretService {

@Autowired
private PretRepository RepPret;

@Transactional
public Pret AjouterPret(Pret p)
{
	return RepPret.save(p);
	
}

@Transactional
public Pret ModifierPret(Pret p)
{
	return RepPret.save(p);
	
}

@Transactional
public void SupprimerPret(Long id)
{
	Pret p= RepPret.getById(id);
	 RepPret.delete(p);
	
}

@Transactional
public List <Pret> ListPret()
{
	return RepPret.findAll();
}

@Transactional
public Optional<Pret> AfficherPret( Long id) {
    return RepPret.findById(id);
}
	
}
