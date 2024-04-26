package it.corso.dto;

import java.util.List;

public class UtenteDto {
	
	private int id;
	private String nome;
	private String cognome;
	public String email;
	private List<UtenteRuoloDto> ruoli;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public List<UtenteRuoloDto> getRuoli() {
		return ruoli;
	}
	public void setRuoli(List<UtenteRuoloDto> ruoli) {
		this.ruoli = ruoli;
	}
	
	
}
