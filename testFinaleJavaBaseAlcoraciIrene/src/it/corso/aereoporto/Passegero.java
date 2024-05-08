package it.corso.aereoporto;

public class Passegero {
	private String nome;
	private String nazionalita;
	private String siglaVolo;
	private String posto;
	private String pasto;
	
	
	public Passegero(String nome, String nazionalita) {
		setNome(nome);
		setNazionalita(nazionalita);
	}
	
	public Passegero(String nome, String nazionalita, String siglaVolo, String posto, String pasto) {
		this(nome, nazionalita);
		setSiglaVolo(siglaVolo);
		setPosto(posto);
		setPasto(pasto);
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNazionalita() {
		return nazionalita;
	}


	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}


	public String getSiglaVolo() {
		return siglaVolo;
	}


	public void setSiglaVolo(String siglaVolo) {
		this.siglaVolo = siglaVolo;
	}


	public String getPosto() {
		return posto;
	}


	public void setPosto(String posto) {
		this.posto = posto;
	}


	public String getPasto() {
		return pasto;
	}


	public void setPasto(String pasto) {
		this.pasto = pasto;
	}
	
	public boolean cambiaPosto(String posto) {
		if(!(this.posto.equals(null))) {
			setPosto(posto);
			return true;
		}
		return false;
	}

	public String infoPassegero() {
		return "Passegero: \nnome = " + this.nome + ", \nnazionalita = " + this.nazionalita + ", \nsiglaVolo = " + this.siglaVolo + ", \nposto = "
				+ this.posto + ", \ntipo pasto = " + this.pasto;
	}
	
	
	

}
