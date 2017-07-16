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

import com.example.demo.entitie.Operation;

import com.example.demo.metier.IOperationMetier;
import com.example.demo.model.BanqueRequest;


public class OperationController {
	@Autowired
	private IOperationMetier operationMetier;
	
	
	//@RequestMapping(value="/getAllOperation", method = { RequestMethod.GET })
	@ResponseBody
	public List<Operation> getAllOperation(@RequestParam String codCpte ){
		return operationMetier.getAllOperation(codCpte);
	}
	
	
}
