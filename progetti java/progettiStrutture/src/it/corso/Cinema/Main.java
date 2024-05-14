package it.corso.Cinema;

import java.time.LocalDate;

/**
 * classe main per testare il funzionamento di un gestore delle prenotazione
 */

public class Main {

	public static void main(String[] args) {
		GestionePrenotazione gp = new GestionePrenotazione();		
		
		System.out.println(gp.aggiungiPrenotazione(new Prenotazione("marco", LocalDate.of(2024, 3, 13))));
		System.out.println(gp.aggiungiPrenotazione(new PrenotazioneSingola("giorgio", LocalDate.of(2024, 3, 13), 13)));
		System.out.println(gp.aggiungiPrenotazione(new PrenotazioneGruppo("grest", LocalDate.of(2024, 3, 13), 10, 8, 2)));
		System.out.println(gp.aggiungiPrenotazione(new PrenotazioneSingola("carlo", LocalDate.of(2024, 3, 13), 13)));
		System.out.println(gp.aggiungiPrenotazione(new PrenotazioneGruppo("scuola", LocalDate.of(2024, 3, 13), 30, 3, 29)));
		System.out.println(gp.visualizzaPrenotazioni(LocalDate.of(2024, 3, 13)));
		System.out.println(gp.eliminaPrenotazione(1));
		System.out.println(gp.visualizzaPrenotazioni(LocalDate.of(2024, 3, 13)));
	}

}
