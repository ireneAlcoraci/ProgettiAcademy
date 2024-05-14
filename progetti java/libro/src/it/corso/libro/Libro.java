package it.corso.libro;

public class Libro {
	private String titolo;
	private String nomeAutore;
	private String ISBN;
	private int  annoUscita;
	
	public Libro() {
		
	}
	
	public Libro(String titolo, String nomeAutore, int annoUscita) {
		setTitolo(titolo);
		setNomeAutore(nomeAutore);
		setAnnoUscita(annoUscita);
	}
	
	public Libro(String titolo, String nomeAutore, String iSBN, int annoUscita) {
		this(titolo, nomeAutore, annoUscita);
		setISBN(iSBN);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getNomeAutore() {
		return nomeAutore;
	}

	public void setNomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public int getAnnoUscita() {
		return annoUscita;
	}

	public void setAnnoUscita(int annoUscita) {
		this.annoUscita = annoUscita;
	}

	public void getInfo() {
		System.out.println("Libro: titolo= " + this.titolo + ",\n" + "nome del autore= " + this.nomeAutore + ",\n" + "anno di uscita= "
				+ this.annoUscita + ",\n" + "ISBN= " + this.ISBN);
	}
	
	public String ottieniInfo() {
		return "Libro: titolo= " + this.titolo + ", nome del autore= " + this.nomeAutore + ", anno di uscita= "
				+ this.annoUscita + ", ISBN= " + this.ISBN;
	}
	

}
