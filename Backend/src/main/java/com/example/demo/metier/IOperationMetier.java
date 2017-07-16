package com.example.demo.metier;

import java.util.List;

import com.example.demo.entitie.Operation;

public interface IOperationMetier {
 public List<Operation> getAllOperation(String codeCmpte);
}
