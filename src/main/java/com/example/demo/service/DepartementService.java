package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Uti;
import com.example.demo.repository.DepartementRepository;

@Service
public class DepartementService {

@Autowired
private DepartementRepository RepDepartement;

@Transactional
public Departement AjouterDepartement(Departement d)
{
	return RepDepartement.save(d);
	
}

@Transactional
public Departement ModifierDepartement(Departement d)
{
	return RepDepartement.save(d);
	
}

@Transactional
public void SupprimerDepartement(Long id)
{
	Departement d= RepDepartement.getById(id);
	 RepDepartement.delete(d);
	
}

@Transactional
public List <Departement> ListDepartement()
{
	return RepDepartement.findAll();
}

@Transactional
public Optional<Departement> AfficherDepartement( Long id) {
    return RepDepartement.findById(id);
}
	
}
