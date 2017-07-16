package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CompteRepository;
import com.example.demo.dao.OperationRepository;
import com.example.demo.entitie.Compte;
import com.example.demo.entitie.Retrait;
import com.example.demo.entitie.Versement;

@SpringBootApplication
public class VVotreBBakkApplication implements CommandLineRunner {
	
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VVotreBBakkApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Compte cp=compteRepository.save(new Compte("c1", new Date(), 100));
		operationRepository.save(new Versement(new Date(), 200, cp));
		operationRepository.save(new Versement(new Date(), 700, cp));
		operationRepository.save(new Versement(new Date(), 300, cp));
		operationRepository.save(new Retrait(new Date(), 200, cp));
		
	}
}
