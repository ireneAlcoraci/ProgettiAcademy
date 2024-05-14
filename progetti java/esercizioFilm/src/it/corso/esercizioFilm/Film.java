package it.corso.esercizioFilm;

public class Film {
	private String titolo;
	private String nomeRegista;
	private String linguaOrigine;
	private int anno;
	private String nazione;
	
	public Film() {
		
	}

	public Film(String titolo, String nomeRegista, int anno, String nazione) {
		setTitolo(titolo);
		setNomeRegista(nomeRegista);
		setAnno(anno);
		setNazione(nazione);
	}
	

	public Film(String titolo, String nomeRegista, String linguaOrigine, int anno, String nazione) {
		this(titolo,nomeRegista,anno,nazione);
		setLinguaOrigine(linguaOrigine);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getNomeRegista() {
		return nomeRegista;
	}

	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}

	public String getLinguaOrigine() {
		return linguaOrigine;
	}

	public void setLinguaOrigine(String linguaOrigine) {
		this.linguaOrigine = linguaOrigine;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	
	public void modificaTitolo(String titolo) {
		setTitolo(titolo);
	}

	@Override
	public String toString() {
		return "Film: titolo=" + this.titolo + ", nomeRegista= " + this.nomeRegista + ", linguaOrigine= " + this.linguaOrigine
				+ ", anno= " + this.anno + ", nazione= " + this.nazione;
	}

	
	
}
