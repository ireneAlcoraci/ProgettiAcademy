package it.corso.interfacce.esercizio13;

public class LibroCartaceo extends Libro{

	public LibroCartaceo(String titolo, String autore, int numeroPagine) {
		super(titolo, autore, numeroPagine);
	}

	public void informazioni() {
		System.out.println(this.getTitolo() + " " + this.getAutore() + " " + this.getNumeroPagine() + " formato: cartaceo ");
	}
}
