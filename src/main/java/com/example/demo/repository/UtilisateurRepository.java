package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Uti;



public interface UtilisateurRepository extends JpaRepository <Uti,Long> {

	

}
