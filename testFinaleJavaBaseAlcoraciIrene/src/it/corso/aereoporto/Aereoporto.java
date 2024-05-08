package it.corso.aereoporto;

public class Aereoporto {
	private String nome;
	private String citta;
	private String sigla;
	
	public Aereoporto(String nome) {
		setNome(nome);
	}

	public Aereoporto(String nome, String citta, String sigla) {
		this(nome);
		setCitta(citta);
		setSigla(sigla);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
	public String infoAeroporto() {
		return "Aereoporto " + this.nome + " a " + this.citta + ", sigla " + this.sigla;
	}

	
	
}
