package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Conge;
import com.example.demo.entity.Uti;
import com.example.demo.repository.CongeRepository;

@Service
public class CongeService {

@Autowired
private CongeRepository RepConge;

@Transactional
public Conge AjouterConge(Conge c)
{
	return RepConge.save(c);
	
}

@Transactional
public Conge ModifierConge(Conge c)
{
	return RepConge.save(c);
	
}

@Transactional
public void SupprimerConge(Long id)
{
	Conge c= RepConge.getById(id);
	 RepConge.delete(c);
	
}

@Transactional
public List <Conge> ListConge()
{
	return RepConge.findAll();
}

@Transactional
public Optional<Conge> AfficherConge( Long id) {
    return RepConge.findById(id);
}
	
}
