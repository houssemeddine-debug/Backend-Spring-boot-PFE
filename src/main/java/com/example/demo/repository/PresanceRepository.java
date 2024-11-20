package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ClePresance;
import com.example.demo.entity.Presanse;

public interface PresanceRepository extends JpaRepository<Presanse , ClePresance > {

}
