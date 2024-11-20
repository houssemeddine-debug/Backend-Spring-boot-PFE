package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_transfert")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transfert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_transfet ;
	@Column
	private String nom_utilisateur ;
	@Column
	private String prenom_utilisateur ;
	@Column
	private String succursal_actuel ;
	@Column
	private String nouvelle_succursale ;
	@Column
	private int etat1 ;
	@Column
	private int etat2 ;
	@ManyToOne
	private Uti utilisateur ;
	

}
