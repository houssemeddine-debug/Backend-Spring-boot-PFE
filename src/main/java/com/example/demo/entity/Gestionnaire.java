package com.example.demo.entity;

import java.util.List;
import com.example.demo.entity.Succursale1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_Gestionnaire")

public class Gestionnaire {

	
	@Id 
	private Long ncin;
	
	@Column(name="nom", length=30)
	private String nom;
	
	@Column(name="prenom", length=30)
	private String prenom;
	
	@Column(name="mdp", length=30)
	private String mdp;

	@Column(name="role", length=30)
	private String role;
	
	@Column(name="email" , length = 30)
	private String email ;
	
	@Column(name="etat" , length = 30)
	private String etat ;
	
	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToOne
	private Succursale1 succursale ;

	public Long getNcin() {
		return ncin;
	}

	public void setNcin(Long ncin) {
		this.ncin = ncin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Succursale1 getSuccursale() {
		return succursale;
	}
	public void setSuccursale(Succursale1 succursale) {
		this.succursale = succursale;
	}

	public Gestionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gestionnaire(Long ncin, String nom, String prenom, String mdp, String role, String email,
			Succursale1 succursale , String etat) {
		super();
		this.ncin = ncin;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.role = role;
		this.email = email;
		this.etat = etat ;
		this.succursale = succursale;
	}

	@Override
	public String toString() {
		return "Gestionnaire [ncin=" + ncin + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", role=" + role
				+ ", email=" + email +", etat=" + etat + ", succursale=" + succursale + "]";
	}
	

	
	
}
