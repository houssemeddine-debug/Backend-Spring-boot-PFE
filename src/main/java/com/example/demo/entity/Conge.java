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
@Table(name="T_Conge")
public class Conge {

	
	public Uti getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Uti utilisateur) {
		this.utilisateur = utilisateur;
	}

	@ManyToOne
	private Uti utilisateur;
	
	@Id  
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mat_conge;
	
	
	public Long getMat_conge() {
		return mat_conge;
	}

	public void setMat_conge(Long mat_conge) {
		this.mat_conge = mat_conge;
	}

	public String getType_conge() {
		return type_conge;
	}

	public void setType_conge(String type_conge) {
		this.type_conge = type_conge;
	}

	public Date getDate_debut_conge() {
		return date_debut_conge;
	}

	public void setDate_debut_conge(Date date_debut_conge) {
		this.date_debut_conge = date_debut_conge;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	@Column(name="type_conge", length=30)
	private String type_conge;
	
	
	//@JsonFormat(pattern="dd-MM-YYYY")
	@Column (name="date_debut_conge")
	private Date date_debut_conge;

	//@JsonFormat(pattern="dd-MM-YYYY")
	@Column (name="date_fin_conge")
	private Date date_fin;
	
	@Column
	private String role ;


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
