package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitie.Compte;

public interface CompteRepository  extends JpaRepository<Compte, String> {

}
