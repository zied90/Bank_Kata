package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitie.Compte;
import com.example.demo.entitie.Operation;
import com.example.demo.metier.IBanqueMetier;
import com.example.demo.metier.IOperationMetier;
import com.example.demo.model.BanqueRequest;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CompteController {
	@Autowired
	private IBanqueMetier banqueMetier;
	
	@RequestMapping(value="/verser", method = { RequestMethod.POST })
	@ResponseBody
	public void verser(@RequestBody BanqueRequest banqueRequest){
		System.out.println(banqueRequest);
		banqueMetier.verser(banqueRequest.getCodCpte(), banqueRequest.getMontant());
	}
	
	
	@RequestMapping(value="/retirer", method = { RequestMethod.POST })
	@ResponseBody
	public void retirer(@RequestBody BanqueRequest banqueRequest){
		banqueMetier.retirer(banqueRequest.getCodCpte(), banqueRequest.getMontant());
	}
	
	@RequestMapping(value="/consulterCompte", method = { RequestMethod.GET })
	@ResponseBody
	public Compte consulterCompte(@RequestBody BanqueRequest banqueRequest){
		return banqueMetier.consulterCompte(banqueRequest.getCodCpte());
	}
	@Autowired
	private IOperationMetier operationMetier;
	
	
	@RequestMapping(value="/getAllOperation", method = { RequestMethod.GET })
	@ResponseBody
	public List<Operation> getAllOperation(@RequestParam String codCpte ){
		return operationMetier.getAllOperation(codCpte);
	}
	

}
