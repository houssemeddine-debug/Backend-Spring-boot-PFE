package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pret;

public interface PretRepository extends JpaRepository <Pret,Long> {

}
