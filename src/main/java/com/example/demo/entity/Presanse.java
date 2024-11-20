package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="T_Presance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Presanse {

	 @EmbeddedId
	    private ClePresance clecompose;
	 @Column 
	 private String etat ;
	 @ManyToOne
		private Uti utilisateur; 
	
}
