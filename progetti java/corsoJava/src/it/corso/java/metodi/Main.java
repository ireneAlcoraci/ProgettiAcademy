package it.corso.java.metodi;

public class Main {

	public static void main(String[] args) {
		Metodo m = new Metodo();
		
		System.out.println(m.trovaCarattereNellaStringa('a', "casa"));
		System.out.println(m.numeroOccorrenze('a', "tartassare"));
		System.out.println(m.trovaPosizioneCarattereNellaStringa('s', "casa"));
		System.out.println(m.confrontaCaratteriNellaStringa('s', 'a',  "cassa"));

		Metodo2 m2 = new Metodo2();
		System.out.println(m2.intermezzaStringa("casa", '/'));
		System.out.println(Metodo2.fibonacciRicorsivo(5));
		System.out.println(Metodo2.fibonacci(5));
	}

}
