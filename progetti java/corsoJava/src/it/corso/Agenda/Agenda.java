package it.corso.Agenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<String> elencoElementi;

	private ArrayList<String> getAgenda() {
		if(this.elencoElementi == null) {
			this.elencoElementi = new ArrayList<>();
		}
		return elencoElementi;
	}

	public void aggiungiElemento(String elemento) {
		getAgenda().add(elemento);
	}
	
	public void stampa() {
		getAgenda().stream().forEach(System.out :: println);
	}
	
	
	
	
}
