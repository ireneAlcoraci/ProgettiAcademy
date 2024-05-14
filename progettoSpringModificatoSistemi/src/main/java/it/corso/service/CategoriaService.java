package it.corso.service;

import java.util.List;

import it.corso.dto.CategoriaAggiornamenoDto;
import it.corso.dto.CategoriaCreazioneDto;
import it.corso.dto.CategoriaDto;


public interface CategoriaService {
	
	CategoriaDto getCategoriaById(int id);
	List<CategoriaDto> getAllCategorie(String nome);
	void createCategoria(CategoriaCreazioneDto categoriaCreazioneDto);
	void updatecategoria(CategoriaAggiornamenoDto categoriaDto);
	void deleteCategoria(int id);

}
