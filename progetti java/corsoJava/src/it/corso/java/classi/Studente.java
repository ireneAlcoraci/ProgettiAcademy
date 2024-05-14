package it.corso.java.classi;

public class Studente {
	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente(String nome, String cognome) {
		setNome(nome);
		setCognome(cognome);
	}

	public Studente(String nome, String cognome, String matricola) {
		this(nome, cognome);
		setMatricola(matricola);
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

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "nome= " + this.nome + ", cognome= " + this.cognome + ", matricola= " + this.matricola;
	}
	
}
