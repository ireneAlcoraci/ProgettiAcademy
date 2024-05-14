package it.corso.ElencoTelefonico;

import java.util.LinkedList;

public class GestioneElencoTelefonico {
	private LinkedList<Contatto> elencoTelefonico;
	
	public GestioneElencoTelefonico() {
		elencoTelefonico = new LinkedList<>();
	}

	public LinkedList<Contatto> getElencoTelefonico() {
		return elencoTelefonico;
	}

	public void setElencoTelefonico(LinkedList<Contatto> elencoTelefonico) {
		this.elencoTelefonico = elencoTelefonico;
	}
	
	/**
	 * funzione che permette di inserire un contatto
	 * @param c= contatto da inserire
	 * @return un booleano che restituisce true se il contatto viene inserito correttamente false altrimenti
	 */
	
	public boolean aggiungiContatto(Contatto c) {
		return elencoTelefonico.add(c);
	}
	
	/**
	 * funzione che ricerca un contatto tramite il nome
	 * @param nome= nome del contatto
	 * @return una lista di contatti che contengono il nome dato in ingresso
	 */
	
	public LinkedList<Contatto> ricercaContatto(String nome){
		LinkedList<Contatto> lista = new LinkedList<>();
		for(Contatto contatto: elencoTelefonico) {
			if(contatto.getNome().equalsIgnoreCase(nome)) {
				lista.add(contatto);
			}
		}
		
		return lista;
	}
	
	/**
	 * funzione che rimuove un contatto
	 * @param numero= numero di telefono
	 * @return un booleano che restituisce true se il contatto viene rimosso correttamente false altrimenti
	 */
	
	public boolean rimuoviContatto(String numero) {	
		return elencoTelefonico.removeIf(elenco -> elenco.getNumeroTelefono().equals(numero));
	}
	
	

}
