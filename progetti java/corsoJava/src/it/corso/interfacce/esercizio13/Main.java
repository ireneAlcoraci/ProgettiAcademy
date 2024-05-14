package it.corso.interfacce.esercizio13;

public class Main {

	public static void main(String[] args) {
		LibroCartaceo libro = new LibroCartaceo("manuale java", "de sio cesarini", 400);
		libro.informazioni();
		
		Ebook eb = new Ebook("manuale java", "de sio cesarini", 400);
		eb.informazioni();
		eb.visualizza();
	}

}
