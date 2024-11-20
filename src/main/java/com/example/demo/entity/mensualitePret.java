package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="T_MensualitePret")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class mensualitePret {
	@EmbeddedId
    private ClePret clecompose;
	
	@Column(name="etat")
	private String  etat ;
	@ManyToOne
	private Uti utilisateur; 

}
