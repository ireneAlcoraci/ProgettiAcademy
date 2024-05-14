package it.corso.interfacce.esercizio13;

public class Ebook extends Libro implements FormatoDigitale{

	public Ebook(String titolo, String autore, int numeroPagine) {
		super(titolo, autore, numeroPagine);
	}

	public void informazioni() {
		System.out.println(this.getTitolo() + " " + this.getAutore() + " " + this.getNumeroPagine() + " formato: ebook " );
	}
	
	@Override
	public void visualizza() {
		System.out.println("libro disponibile in formato digitale");
		
	}

}
