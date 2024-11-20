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
@Table(name="T_Avertissement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avertissement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	
	@Column
	private String contenu_avertissement ;
	
	@ManyToOne
	private Uti utilisateur; 
	
}
