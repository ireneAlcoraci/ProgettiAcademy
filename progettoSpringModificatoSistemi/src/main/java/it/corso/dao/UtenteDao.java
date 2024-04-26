package it.corso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.corso.model.Utente;

public interface UtenteDao extends JpaRepository<Utente, Integer>{
	
	boolean existsByEmail(String email);
	
	Utente findByEmail(String email);
	
	Utente findByEmailAndPassword(String email, String password);
}
