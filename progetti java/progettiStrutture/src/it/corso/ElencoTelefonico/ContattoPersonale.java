package it.corso.ElencoTelefonico;

public class ContattoPersonale extends Contatto {
	private String indirizzo;
	
	/**
	 * costruttore della superclasse
	 * @param nome
	 * @param numeroTelefono
	 * @param etichetta
	 */
	
	public ContattoPersonale(String nome, String numeroTelefono, String etichetta) {
		super(nome, numeroTelefono, etichetta);
		
	}

	/**
	 * costruttore che, oltre a prendere in ingresso i parametri della classe Contatto, prende in ingresso la variabile di istanza indirizzo
	 * @param nome
	 * @param numeroTelefono
	 * @param etichetta
	 * @param indirizzo
	 */
	public ContattoPersonale(String nome, String numeroTelefono, String etichetta, String indirizzo) {
		super(nome, numeroTelefono, etichetta);
		setIndirizzo(indirizzo);
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return super.toString() + " indirizzo: " + this.indirizzo;
	}
	
	

}
