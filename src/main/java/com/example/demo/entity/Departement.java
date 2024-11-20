package com.example.demo.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="T_Departement")

public class Departement {
	
	@ManyToOne
	private Succursale1 succursale;
	
	@Id 
	private Long id;

	
	@Column(name="nom_departement", length=30)
	private String nom_departement;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_departement() {
		return nom_departement;
	}

	public void setNom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}

	public String getEmail_departement() {
		return email_departement;
	}

	public void setEmail_departement(String email_departement) {
		this.email_departement = email_departement;
	}
	
	

	@Column(name="email_departement", length=30)
	private String email_departement;
	
	@OneToMany(mappedBy="departement" ,  cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Uti>utilisateur;


	public Succursale1 getSuccursale() {
		return succursale;
	}

	public void setSuccursale(Succursale1 succursale) {
		this.succursale = succursale;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(Long id, String nom_departement, String email_departement, List<Uti> utilisateur) {
		super();
		this.id = id;
		this.nom_departement = nom_departement;
		this.email_departement = email_departement;
		
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom_departement=" + nom_departement + ", email_departement="
				+ email_departement + ", utilisateur=" + utilisateur + "]";
	}
	

}