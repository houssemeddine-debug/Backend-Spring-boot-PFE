package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ClePret;
import com.example.demo.entity.mensualitePret;

public interface MensualitePretRepository extends JpaRepository <mensualitePret , ClePret> {

}
