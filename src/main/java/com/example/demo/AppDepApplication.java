package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//
import com.example.demo.repository.SocieteRepository;

@SpringBootApplication
public class AppDepApplication implements CommandLineRunner {
	@Autowired
	private SocieteRepository dep;

	public static void main(String[] args) {
		SpringApplication.run(AppDepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Departement d1=dep.save(new Departement(null,"Informatique de Gestion"));
//		Departement d2=dep.save(new Departement(null,"Gestion"));
	}

}