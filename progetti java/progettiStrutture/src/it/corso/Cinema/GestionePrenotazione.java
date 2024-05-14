package it.corso.Cinema;

import java.time.LocalDate;
import java.util.ArrayList;


public class GestionePrenotazione {
	private ArrayList<Prenotazione> elencoPrenotati;

	public GestionePrenotazione() {
		this.elencoPrenotati = new ArrayList<>();
	}


	public ArrayList<Prenotazione> getElencoPrenotati() {
		return elencoPrenotati;
	}

	public void setElencoPrenotati(ArrayList<Prenotazione> elencoPenotati) {
		this.elencoPrenotati = elencoPenotati;
	}
	
	/**
	 * funzione che inserisce una prenotazione 
	 * @param p prenotazione
	 * @return una stringa che informa se l'inserimento e andato a buon fine o meno 
	 */
	
	public String aggiungiPrenotazione(Prenotazione p) {
		if(elencoPrenotati.add(p)) {
			return "prenotazione inserita";
		}else {
			return "impossibile aggiundere prenotazione";
		}
		
	}
	
	/**
	 * funzione che permette di eliminare la prenotazione
	 * @param id id della prenotazione
	 * @return una stringa che informa se l'eliminazione e andata a buon fine o meno
	 */
	public String eliminaPrenotazione(int id) {
		for (int i = 0; i < elencoPrenotati.size(); ++i) {
			if(elencoPrenotati.get(i).getId() == id) {
				Prenotazione p = elencoPrenotati.remove(i);
				 return "Rimossa " + p;
			}
			
		}
		return "errore rimozione";
		
		/*
		 * possibile soluzione alternativa: 
		 * elencoPrenotati.removeIf(elencoPrenotati -> elencoPrenotati.getId() == id);
		 */
	}
	
	/**
	 * funzione che permette di visualizzare un elenco di prenotazioni che hanno tutte la stessa data
	 * @param d data della prenotazione
	 * @return una stringa che rapresenta un elenco delle prenotazioni 
	 */
	
	public String visualizzaPrenotazioni(LocalDate d) {
		String elenco = "";
		for (int i = 0; i < elencoPrenotati.size(); ++i) {
			if(elencoPrenotati.get(i).getDataPrenotazione().equals(d)) {
				 elenco += elencoPrenotati.get(i).toString() + "\n";
			}			
		}
		
		if(elenco.equals("")) {
			return "nessuna prenotazione con questa data";
		}else {
			return elenco;
		}		
		
	}
	

}
