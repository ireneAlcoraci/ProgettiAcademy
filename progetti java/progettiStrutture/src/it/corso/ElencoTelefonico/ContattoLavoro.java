package it.corso.ElencoTelefonico;

public class ContattoLavoro extends Contatto {
	private String posizioneLavorativa;
	
	/**
	 * costruttore della superclasse
	 * @param nome
	 * @param numeroTelefono
	 * @param etichetta
	 */
	
	public ContattoLavoro(String nome, String numeroTelefono, String etichetta) {
		super(nome, numeroTelefono, etichetta);
	}
	
	/**
	 * costruttore che, oltre a prendere in ingresso i parametri della classe Contatto, prende in ingresso la variabile di istanza posizioneLavorativa
	 * @param nome
	 * @param numeroTelefono
	 * @param etichetta
	 * @param posizioneLavorativa
	 */

	public ContattoLavoro(String nome, String numeroTelefono, String etichetta, String posizioneLavorativa) {
		super(nome, numeroTelefono, etichetta);
		setPosizioneLavorativa(posizioneLavorativa);
	}

	public String getPosizioneLavorativa() {
		return posizioneLavorativa;
	}

	public void setPosizioneLavorativa(String posizioneLavorativa) {
		this.posizioneLavorativa = posizioneLavorativa;
	}

	@Override
	public String toString() {
		return super.toString() + " posizione lavorativa: " + this.posizioneLavorativa;
	}

	
	
}
