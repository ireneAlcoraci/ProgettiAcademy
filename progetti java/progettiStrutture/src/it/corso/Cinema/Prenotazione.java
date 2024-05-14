package it.corso.Cinema;

import java.time.LocalDate;


public class Prenotazione {
	private int id;
	private static int cont;
	private String nomeCliente;
	private LocalDate dataPrenotazione;
	
	/**
	 * costruttore che prende in ingresso tutte le variabile di istanza
	 * @param id identificativo univoco della prenotazione
	 * @param nomeCliente nome cliente
	 * @param dataPrenotazione data del giorno di prenotazione 
	 */
	public Prenotazione(String nomeCliente, LocalDate dataPrenotazione) {
		setId();
		setNomeCliente(nomeCliente);
		setDataPrenotazione(dataPrenotazione);
	}

/**
 * metodo get per id
 * @return l'id della prenotazione
 */
	public int getId() {
		return id;
	}

	/**
	 * metodo set per id
	 * @param id
	 */
	
	public void setId() {
		this.id = ++cont;
		
	}

	/**
	 * metodo get per nomeCliente
	 * @return il nome del cliente che ha effettuato la prenotazione
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * metodo set per nomeCliente
	 * @param nomeCliente il nome del cliente
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * metodo get di dataPrenotazione
	 * @return la data di prenotazione
	 */
	
	public LocalDate getDataPrenotazione() {
		return dataPrenotazione;
	}

	/**
	 * metodo set della dataPrenotazione 
	 * @param dataPrenotazione data della prenotazione
	 */
	
	public void setDataPrenotazione(LocalDate dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}


	@Override
	public String toString() {
		return "Prenotazione numero " + this.id + " a nome di " + this.nomeCliente + " per giorno " + this.dataPrenotazione;
	}
	
	

}
