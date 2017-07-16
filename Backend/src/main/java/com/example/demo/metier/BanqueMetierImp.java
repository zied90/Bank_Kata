package com.example.demo.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CompteRepository;
import com.example.demo.dao.OperationRepository;
import com.example.demo.entitie.Compte;
import com.example.demo.entitie.Versement;
@Service
@Transactional
public class BanqueMetierImp implements IBanqueMetier {
	
	@Autowired
    private CompteRepository compteRepository;
	
	@Autowired
	private OperationRepository operationRepository;
	

	@Override
	public void verser(String codeCpte, double montant) {
		Compte cp=consulterCompte(codeCpte);
		if(cp==null){
			cp=new Compte(codeCpte, new Date(), 0);
		}
		Versement v=new Versement(new Date(), montant, cp);
		operationRepository.save(v);
		cp.setSolde(cp.getSolde()+montant);
		compteRepository.save(cp);
	}

	@Override
	public void retirer(String codeCpte, double montant) {
		Compte cp=consulterCompte(codeCpte);
		if(cp==null){
			cp=new Compte(codeCpte, new Date(), 0);
		}
		Versement v=new Versement(new Date(), montant, cp);
		operationRepository.save(v);
		cp.setSolde(cp.getSolde()-montant);
		compteRepository.save(cp);
		
	}

	@Override
	public Compte consulterCompte(String codeCpte) {
		Compte cp=compteRepository.findOne(codeCpte);	
		return cp;
	}

}
