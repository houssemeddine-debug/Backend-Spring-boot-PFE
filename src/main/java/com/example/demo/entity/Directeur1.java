
package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_Directeur")
public class Directeur1 {

	@Id 
	private Long ncin;
	
	@Column(name="nom", length=30)
	private String nom;
	
	@Column(name="prenom", length=30)
	private String prenom;
	
	@Column(name="mdp", length=30)
	private String mdp;

	@Column(name="email", length=30)
	private String email;

	@OneToMany(mappedBy="directeur1" , cascade =  CascadeType.ALL , orphanRemoval = true)
	private List<Societe1> societe1 ;

	public Directeur1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directeur1(Long ncin, String nom, String prenom, String mdp, String email) {
		super();
		this.ncin = ncin;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.email = email;
	
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public List<Societe1> getSociete1() {
//		return societe1;
//	}
//
//	public void setSociete1(List<Societe1> societe1) {
//		this.societe1 = societe1;
//	}

	@Override
	public String toString() {
		return "Directeur1 [ncin=" + ncin + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", email=" + email
				+  "]";
	}

		
	
	
}
