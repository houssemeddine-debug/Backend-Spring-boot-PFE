package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.entity.Succursale1;
import com.example.demo.entity.Uti;
import com.example.demo.repository.SuccursaleRepository;

@Service
public class SuccursaleService {

@Autowired
private SuccursaleRepository RepSuc;

@Transactional
public Succursale1 AjouterSuccursale(Succursale1 suc)
{
	return RepSuc.save(suc);
	
}

@Transactional
public Succursale1 ModifierSuccursale(Succursale1 suc)
{
	return RepSuc.save(suc);
	
}

@Transactional
public void SupprimerSuccursale(Long id)
{
	Succursale1 suc= RepSuc.getById(id);
	 RepSuc.delete(suc);
	
}

@Transactional
public List <Succursale1> ListSuccursale()
{
	return RepSuc.findAll();
}
@Transactional
public Optional<Succursale1> AfficherSuccursale( Long id) {
    return RepSuc.findById(id);
}

	
}
