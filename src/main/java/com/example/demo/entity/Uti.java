package com.example.demo.entity;


import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Table(name="T_Employee")

public class Uti {

	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Pret>pret;
	
	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Conge>conge;
	
	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Formation>formation;
	
	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Avertissement> avert ;
	
	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	 private List<Transfert> transfert ;
	
	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	 private List<mensualitePret> m ;
	
	@OneToMany(mappedBy="utilisateur" , cascade =  CascadeType.ALL , orphanRemoval = true)
	 private List<Presanse> p ;
	@Id 
	private Long Mat_Utilisateur;
	@Column(name="nom_Utilisateur", length=30)
	private String nom_Utilisateur;
	
	@Column(name="prenom_Utilisateur", length=30)
	private String prenom_Utilisateur;
	
	@Column(name="adresse_Utilisateur", length=30)
	private String adresse_Utilisateur;

	@Column(name="email_Utilisateur", length=30)
	private String email_Utilisateur;
	
	@Column(name="mdp_Utilisateur", length=30)
	private String mdp_Utilisateur;
	
	@Column(name="role_Utilisateur", length=30)
	private String role_Utilisateur;
	
	@Column(name="grade_Utilisateur", length=30)
	private String grade_Utilisateur;
	
	@Column(name="salaire_Utilisateur", length=30)
	private String salaire_Utilisateur;
	public Long getMat_Utilisateur() {
		return Mat_Utilisateur;
	}

	public void setMat_Utilisateur(Long mat_Utilisateur) {
		Mat_Utilisateur = mat_Utilisateur;
	}

	public String getNom_Utilisateur() {
		return nom_Utilisateur;
	}

	public Uti() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Uti( Long mat_Utilisateur,String nom_Utilisateur, String prenom_Utilisateur, String adresse_Utilisateur, String email_Utilisateur,
			String mdp_Utilisateur, String role_Utilisateur, String grade_Utilisateur, String salaire_Utilisateur,
			Departement departement) {
		super();
		Mat_Utilisateur = mat_Utilisateur;
		this.nom_Utilisateur = nom_Utilisateur;
		this.prenom_Utilisateur = prenom_Utilisateur;
		this.adresse_Utilisateur = adresse_Utilisateur;
		this.email_Utilisateur = email_Utilisateur;
		this.mdp_Utilisateur = mdp_Utilisateur;
		this.role_Utilisateur = role_Utilisateur;
		this.grade_Utilisateur = grade_Utilisateur;
		this.salaire_Utilisateur = salaire_Utilisateur;
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Utilisateur [Mat_Utilisateur=" + Mat_Utilisateur + ", nom_Utilisateur=" + nom_Utilisateur
				+ ", prenom_Utilisateur=" + prenom_Utilisateur + ", adresse_Utilisateur=" + adresse_Utilisateur
				+ ", email_Utilisateur=" + email_Utilisateur + ", mdp_Utilisateur=" + mdp_Utilisateur
				+ ", role_Utilisateur=" + role_Utilisateur + ", grade_Utilisateur=" + grade_Utilisateur
				+ ", salaire_Utilisateur=" + salaire_Utilisateur + "]";
	}

	public void setNom_Utilisateur(String nom_Utilisateur) {
		this.nom_Utilisateur = nom_Utilisateur;
	}

	public String getPrenom_Utilisateur() {
		return prenom_Utilisateur;
	}

	public void setPrenom_Utilisateur(String prenom_Utilisateur) {
		this.prenom_Utilisateur = prenom_Utilisateur;
	}

	public String getAdresse_Utilisateur() {
		return adresse_Utilisateur;
	}

	public void setAdresse_Utilisateur(String adresse_Utilisateur) {
		this.adresse_Utilisateur = adresse_Utilisateur;
	}

	public String getEmail_Utilisateur() {
		return email_Utilisateur;
	}

	public void setEmail_Utilisateur(String email_Utilisateur) {
		this.email_Utilisateur = email_Utilisateur;
	}

	public String getMdp_Utilisateur() {
		return mdp_Utilisateur;
	}

	public void setMdp_Utilisateur(String mdp_Utilisateur) {
		this.mdp_Utilisateur = mdp_Utilisateur;
	}

	public String getRole_Utilisateur() {
		return role_Utilisateur;
	}

	public void setRole_Utilisateur(String role_Utilisateur) {
		this.role_Utilisateur = role_Utilisateur;
	}

	public String getGrade_Utilisateur() {
		return grade_Utilisateur;
	}

	public void setGrade_Utilisateur(String grade_Utilisateur) {
		this.grade_Utilisateur = grade_Utilisateur;
	}

	public String getSalaire_Utilisateur() {
		return salaire_Utilisateur;
	}

	public void setSalaire_Utilisateur(String salaire_Utilisateur) {
		this.salaire_Utilisateur = salaire_Utilisateur;
	}

	@ManyToOne
	private Departement departement;
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	
	
	
	
	

}
