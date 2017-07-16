package com.example.demo.metier;

import com.example.demo.entitie.Compte;

public interface IBanqueMetier {
public Compte consulterCompte(String  codeCpte);
public void verser(String codeCpte,double montant);
public void retirer(String codeCpte,double montant);
}
