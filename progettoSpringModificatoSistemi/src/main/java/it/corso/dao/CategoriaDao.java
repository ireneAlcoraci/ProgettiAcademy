package it.corso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.corso.model.Categoria;
import it.corso.model.NomeCategoria;

public interface CategoriaDao extends JpaRepository<Categoria, Integer>{

	List<Categoria> findAllByNomeCategoria(NomeCategoria nomeCategoria);
}
