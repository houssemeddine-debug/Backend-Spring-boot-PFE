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
@Table(name="T_Succursale")

public class Succursale1 {
	
	@Id 
	private Long Mat_succursale;
	
	@Column(name="nom_succursale", length=30)
	private String nom_succursale;
	
	@Column(name="email_succursale", length=30)
	private String email_succursale;
	
	@Column(name="adresse_succursale", length=30)
	private String adrese_succursale;
	
	@OneToMany(mappedBy="succursale" ,  cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Departement>departement;
	
	@OneToMany(mappedBy="succursale" ,  cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Gestionnaire> gestionnaire;
	
	@ManyToOne
	private Societe1 societe1;

	public Succursale1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Succursale1(Long mat_succursale, String nom_succursale, String email_succursale, String adrese_succursale, Societe1 societe1) {
		super();
		Mat_succursale = mat_succursale;
		this.nom_succursale = nom_succursale;
		this.email_succursale = email_succursale;
		this.adrese_succursale = adrese_succursale;
		this.societe1 = societe1;
	}

	public Long getMat_succursale() {
		return Mat_succursale;
	}

	public void setMat_succursale(Long mat_succursale) {
		Mat_succursale = mat_succursale;
	}

	public String getNom_succursale() {
		return nom_succursale;
	}

	public void setNom_succursale(String nom_succursale) {
		this.nom_succursale = nom_succursale;
	}

	public String getEmail_succursale() {
		return email_succursale;
	}

	public void setEmail_succursale(String email_succursale) {
		this.email_succursale = email_succursale;
	}

	public String getAdrese_succursale() {
		return adrese_succursale;
	}

	public void setAdrese_succursale(String adrese_succursale) {
		this.adrese_succursale = adrese_succursale;
	}

//	public List<Departement> getDepartement() {
//		return departement;
//	}
//
//	public void setDepartement(List<Departement> departement) {
//		this.departement = departement;
//	}

	public Societe1 getSociete1() {
		return societe1;
	}

	public void setSociete1(Societe1 societe1) {
		this.societe1 = societe1;
	}

	@Override
	public String toString() {
		return "Succursale1 [Mat_succursale=" + Mat_succursale + ", nom_succursale=" + nom_succursale
				+ ", email_succursale=" + email_succursale + ", adrese_succursale=" + adrese_succursale
				+ ", societe1 =" + societe1 + "]";
	}
	
	
	
	


}