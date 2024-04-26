package it.corso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.corso.model.Corso;

public interface CorsoDao extends JpaRepository<Corso, Integer>{

}
