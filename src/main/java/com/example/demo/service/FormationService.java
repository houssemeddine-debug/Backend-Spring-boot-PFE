package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Formation;
import com.example.demo.entity.Uti;
import com.example.demo.repository.FormationRepository;

@Service
public class FormationService {

@Autowired
private FormationRepository RepFormation;

@Transactional
public Formation AjouterFormation(Formation f)
{
	return RepFormation.save(f);
	
}

@Transactional
public Formation ModifierFormation(Formation f)
{
	return RepFormation.save(f);
	
}

@Transactional
public void SupprimerFormation(Long id)
{
	Formation f= RepFormation.getById(id);
	 RepFormation.delete(f);
	
}

@Transactional
public List <Formation> ListFormation()
{
	return RepFormation.findAll();
}

@Transactional
public Optional<Formation> AfficherFormation( Long id) {
    return RepFormation.findById(id);
}
	
}
