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
@Table(name="T_Societe")

public class Societe1 {

	@Id 
	private Long Mat_societe;
	
	@Column(name="nom_societe", length=80)
	private String nom_societe;
	
	@Column(name="email_societe", length=80)
	private String email_societe;
	
	@Column(name="adresse_societe", length=80)
	private String adrese_societe;
	
	@OneToMany(mappedBy="societe1" , cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Succursale1>succursale;
	
	@ManyToOne
	private Directeur1 directeur1 ;

	public Societe1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Societe1(Long mat_societe, String nom_societe, String email_societe, String adrese_societe,
			 Directeur1 directeur1) {
		super();
		Mat_societe = mat_societe;
		this.nom_societe = nom_societe;
		this.email_societe = email_societe;
		this.adrese_societe = adrese_societe;
		this.directeur1 = directeur1;
	}

	public Long getMat_societe() {
		return Mat_societe;
	}

	public void setMat_societe(Long mat_societe) {
		Mat_societe = mat_societe;
	}

	public String getNom_societe() {
		return nom_societe;
	}

	public void setNom_societe(String nom_societe) {
		this.nom_societe = nom_societe;
	}

	public String getEmail_societe() {
		return email_societe;
	}

	public void setEmail_societe(String email_societe) {
		this.email_societe = email_societe;
	}

	public String getAdrese_societe() {
		return adrese_societe;
	}

	public void setAdrese_societe(String adrese_societe) {
		this.adrese_societe = adrese_societe;
	}

//	public List<Succursale1> getSuccursale() {
//		return succursale;
//	}
//
//	public void setSuccursale(List<Succursale1> succursale) {
//		this.succursale = succursale;
//	}

	public Directeur1 getDirecteur1() {
		return directeur1;
	}

	public void setDirecteur1(Directeur1 directeur1) {
		this.directeur1 = directeur1;
	}

	@Override
	public String toString() {
		return "Societe1 [Mat_societe=" + Mat_societe + ", nom_societe=" + nom_societe + ", email_societe="
				+ email_societe + ", adrese_societe=" + adrese_societe +  ", directeur1="
				+ directeur1 + "]";
	}
	
	
	
}

