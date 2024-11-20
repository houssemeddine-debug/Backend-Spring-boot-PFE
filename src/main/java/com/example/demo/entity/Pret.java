package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="T_Pret")

public class Pret {


	@ManyToOne
	private Uti utilisateur; 
	
	public Long getMat_pret() {
		return mat_pret;
	}

	public void setMat_pret(Long mat_pret) {
		this.mat_pret = mat_pret;
	}

	public String getType_pret() {
		return type_pret;
	}

	public void setType_pret(String type_pret) {
		this.type_pret = type_pret;
	}

	public Double getSomme_pret() {
		return somme_pret;
	}

	public void setSomme_pret(Double somme_pret) {
		this.somme_pret = somme_pret;
	}

	public LocalDateTime getDate_debut_pret() {
		return date_debut_pret;
	}

	public void setDate_debut_pret(LocalDateTime date_debut_pret) {
		this.date_debut_pret = date_debut_pret;
	}

	public LocalDateTime getDate_fin_pret() {
		return date_fin_pret;
	}

	public void setDate_fin_pret(LocalDateTime date_fin_pret) {
		this.date_fin_pret = date_fin_pret;
	}

	@Id 
	private Long mat_pret;
	
	@Column(name="type_pret", length=30)
	private String type_pret;
	
	@Column(name="versement")
	private Long versement ;
	
	public Uti getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Uti utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Long getVersement() {
		return versement;
	}

	public void setVersement(Long versement) {
		this.versement = versement;
	}

	@Column(name="somme_pret")
	private Double somme_pret;
	

	@Column (name="date_debut_pret")
	private LocalDateTime date_debut_pret;


	@Column (name="date_fin_pret")
	private LocalDateTime date_fin_pret;
	
	@Column (name="etatPret")
	private int etatPret ;

	public int getEtatPret() {
		return etatPret;
	}

	public void setEtatPret(int etatPret) {
		this.etatPret = etatPret;
	}
	

}
