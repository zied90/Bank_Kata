package com.example.demo.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CompteRepository;
import com.example.demo.dao.OperationRepository;
import com.example.demo.entitie.Compte;
import com.example.demo.entitie.Operation;

@Service
public class OperationMetierImp  implements IOperationMetier {
	@Autowired
	private OperationRepository operationRepository;
	
	@Autowired
	private CompteRepository compteRepository;
	
	@Override
	public List<Operation> getAllOperation(String codeCmpte) {
		
		Compte cp=compteRepository.findOne(codeCmpte);
		if(cp==null)
			return new ArrayList<>();
		return (List<Operation>) cp.getOperations();
		
		
	}

	
	}


