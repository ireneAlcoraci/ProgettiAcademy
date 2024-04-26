package it.corso.dto;

import java.util.List;

import it.corso.model.NomeCategoria;


public class CategoriaDto {

	private int id;
	private NomeCategoria nomeCategoria;
	private List<CategoriaCorso> corsi;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public NomeCategoria getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(NomeCategoria nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public List<CategoriaCorso> getCorsi() {
		return corsi;
	}
	public void setCorsi(List<CategoriaCorso> corsi) {
		this.corsi = corsi;
	}
	
	
}
