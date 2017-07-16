package com.example.demo.model;

import java.io.Serializable;

public class BanqueRequest implements Serializable  {
	  private String codCpte;
	  private double montant;
	public String getCodCpte() {
		return codCpte;
	}
	public void setCodCpte(String codCpte) {
		this.codCpte = codCpte;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public BanqueRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BanqueRequest(String codCpte, double montant) {
		super();
		this.codCpte = codCpte;
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "BanqueRequest [codCpte=" + codCpte + ", montant=" + montant + "]";
	}
	
	
	

}
