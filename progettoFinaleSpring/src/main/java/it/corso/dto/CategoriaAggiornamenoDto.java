package it.corso.dto;

import it.corso.model.NomeCategoria;

public class CategoriaAggiornamenoDto {

	private int id;
	private NomeCategoria nomeCategoria;
	private int idCorsi;
	
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
	public int getIdCorsi() {
		return idCorsi;
	}
	public void setIdCorsi(int idCorsi) {
		this.idCorsi = idCorsi;
	}
	
	
	
}
