package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Avertissement;
import com.example.demo.entity.Uti;
import com.example.demo.repository.AvertissementRepository;

@Service
public class AvertissementService {

	@Autowired
	private AvertissementRepository ar ;
	
	@Transactional
	public Avertissement AjouterAvertissement(Avertissement a)
	{
		return ar.save(a);
		
	}
	
	@Transactional
	public List <Avertissement> ListAvertissement()
	{
		return ar.findAll();
	}
}
