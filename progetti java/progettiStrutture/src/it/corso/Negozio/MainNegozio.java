package it.corso.Negozio;

import java.time.LocalDate;

public class MainNegozio {

	public static void main(String[] args) {
		Negozio n = new Negozio();

		System.out.println(n.aggiungiProdotto(new ProdottoAlimentare(0,"banana", 5,  2.30, LocalDate.of(2024, 5, 13))));
		System.out.println(n.aggiungiProdotto(new ProdottoAlimentare(1,"mela", 6, 2.30, LocalDate.of(2024, 5, 25))));
		System.out.println(n.aggiungiProdotto(new ProdottoElettronico(2,"computer", 2,  300, 24)));
		System.out.println(n.aggiungiProdotto(new ProdottoElettronico(3,"tablet", 3, 230, 12)));
		System.out.println(n.aggiungiProdotto(new ProdottoAlimentare(4,"pera", 5, 2.30, LocalDate.of(2024, 5, 20))));
		System.out.println(n.visualizzaProdotti());
		System.out.println(n.eliminaProdotto(0));
		System.out.println(n.visualizzaProdotti());
		System.out.println(n.modificaQuantita(2, 5));
		System.out.println(n.visualizzaProdotto(2));

		
		
	}

}
