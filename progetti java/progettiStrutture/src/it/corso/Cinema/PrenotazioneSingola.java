package it.corso.Cinema;

import java.time.LocalDate;

public class PrenotazioneSingola extends Prenotazione {
	private int numeroPosto; 
	
	/**
	 * costruttore della superclasse
	 * @param id id della prenotazione
	 * @param nomeCliente nome del cliente che effettua la prenotazione
	 * @param dataPrenotazione data di prenotazione
	 */
	
	public PrenotazioneSingola(String nomeCliente, LocalDate dataPrenotazione) {
		super(nomeCliente, dataPrenotazione);
		
	}

	/**
	 * costruttore che, oltre a prendere in ingresso i parametri della classe Prenotazione, prende in ingresso le variabili di istanza della classe  
	 * @param id id della prenotazione
	 * @param nomeCliente nome del cliente che effettua la prenotazione
	 * @param dataPrenotazione data di prenotazione
	 * @param numeroPosto numero del posto del cinema
	 */
	
	public PrenotazioneSingola(String nomeCliente, LocalDate dataPrenotazione, int numeroPosto) {
		super(nomeCliente, dataPrenotazione);
		setNumeroPosto(numeroPosto);
	}

	public int getNumeroPosto() {
		return numeroPosto;
	}

	public void setNumeroPosto(int numeroPosto) {
		if(numeroPosto >= 0) {
			this.numeroPosto = numeroPosto;
		}else {
			System.out.println("inserire un valore positivo");
		}
		
	}

	@Override
	public String toString() {
		return super.toString() + " numeroPosto " + this.numeroPosto;
	}
	
	

}
