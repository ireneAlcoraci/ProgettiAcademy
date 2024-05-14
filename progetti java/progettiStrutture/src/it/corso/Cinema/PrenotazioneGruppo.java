package it.corso.Cinema;

import java.time.LocalDate;


public class PrenotazioneGruppo extends Prenotazione {
	private int numeroTotale;
	private int numeroAdulti;
	private int numeroBambini;
	
	/**
	 * costruttore della superclasse
	 * @param id id della prenotazione
	 * @param nomeCliente nome del cliente che effettua la prenotazione
	 * @param dataPrenotazione data di prenotazione
	 */
	
	public PrenotazioneGruppo(String nomeCliente, LocalDate dataPrenotazione) {
		super(nomeCliente, dataPrenotazione);
		
	}

	/**
	 * costruttore che, oltre a prendere in ingresso i parametri della classe Prenotazione, prende in ingresso le variabili di istanza della classe  
	 * @param id id della prenotazione
	 * @param nomeCliente nome del cliente che effettua la prenotazione
	 * @param dataPrenotazione data di prenotazione 
	 * @param numeroTotale numero totale di persone nel gruppo
	 * @param numeroAdulti numero degli adulti nel gruppo
	 * @param numeroBambini numero dei bambini nel gruppo
	 */
	
	public PrenotazioneGruppo(String nomeCliente, LocalDate dataPrenotazione, int numeroTotale, int numeroAdulti,
			int numeroBambini) {
		super(nomeCliente, dataPrenotazione);
		setNumeroAdulti(numeroAdulti);
		setNumeroBambini(numeroBambini);
		setNumeroTotale(numeroTotale);
	}

	public int getNumeroTotale() {
		return numeroTotale;
	}

	public void setNumeroTotale(int numeroTotale) {
		if(numeroTotale >= 0 && numeroTotale == this.numeroAdulti + this.numeroBambini) {
			this.numeroTotale = numeroTotale;
		}else {
			System.out.println("valore inserito non corretto");
			this.numeroTotale = this.numeroAdulti + this.numeroBambini;
		}
		
	}

	public int getNumeroAdulti() {
		return numeroAdulti;
	}

	public void setNumeroAdulti(int numeroAdulti) {
		if(numeroAdulti >= 0) {
			this.numeroAdulti = numeroAdulti;
		}else {
			System.out.println("inserire un valore positivo");
		}
		
	}

	public int getNumeroBambini() {
		return numeroBambini;
	}

	public void setNumeroBambini(int numeroBambini) {
		if(numeroBambini >= 0) {
			this.numeroBambini = numeroBambini;
		}else {
			System.out.println("inserire un valore positivo");
		}
		
	}

	@Override
	public String toString() {
		return super.toString() + " numero totale del gruppo " + this.numeroTotale + " numero adulti " + this.numeroAdulti
				+ " numero bambini " + this.numeroBambini;
	}
	
	

}
