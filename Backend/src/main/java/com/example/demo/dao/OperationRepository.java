package com.example.demo.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitie.Operation;

import antlr.collections.List;

public interface OperationRepository  extends JpaRepository<Operation, Long>{
	

}
