package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClePret implements Serializable {
	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


	@Column (name="date")
	private LocalDateTime date;

}
