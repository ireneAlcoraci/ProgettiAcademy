package it.corso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.corso.model.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Integer>{

}
