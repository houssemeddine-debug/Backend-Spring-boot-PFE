package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="T_Formation")

public class Formation {

	@ManyToOne
	private Uti utilisateur; 

	public String getNom_formation() {
		return nom_formation;
	}

	public void setNom_formation(String nom_formation) {
		this.nom_formation = nom_formation;
	}

	public String getSujet_formation() {
		return sujet_formation;
	}

	public void setSujet_formation(String sujet_formation) {
		this.sujet_formation = sujet_formation;
	}

	public Date getDate_formation() {
		return date_formation;
	}

	public void setDate_formation(Date date_formation) {
		this.date_formation = date_formation;
	}

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mat_formation;
	
	@Column(name="nom_formation", length=30)
	private String nom_formation;
	
	@Column(name="sujet_formation", length=30)
	private String sujet_formation;
	
	public Long getMat_formation() {
		return mat_formation;
	}

	public void setMat_formation(Long mat_formation) {
		this.mat_formation = mat_formation;
	}

	//@JsonFormat(pattern="dd-MM-YYYY")
	@Column (name="date_formation")
	private Date date_formation;
	
	@Column
	private String role ;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	


	public Uti getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Uti utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(Uti utilisateur, Long mat_formation, String nom_formation, String sujet_formation,
			Date date_formation, String role) {
		super();
		this.utilisateur = utilisateur;
		this.mat_formation = mat_formation;
		this.nom_formation = nom_formation;
		this.sujet_formation = sujet_formation;
		this.date_formation = date_formation;
		this.role = role;
	}

	
	
}
