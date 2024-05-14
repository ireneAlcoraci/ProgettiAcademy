package it.corso.ElencoTelefonico;
/**
 * classe contatto che si pone l'obbiettivo di generalizzare l'idea di contatto
 */
public class Contatto {
	private String nome;
	private String numeroTelefono;
	private String etichetta;
		
	/**
	 * costruttore che prende in ingresso tutte le variabile di istanza
	 * @param nome = rappresenta il nome del contatto
	 * @param numeroTelefono = rappresenta il numero di telefono del contatto
	 * @param etichetta = rappresenta una piccola descrizione del contatto
	 */
	public Contatto(String nome, String numeroTelefono, String etichetta) {
		setNome(nome);
		setNumeroTelefono(numeroTelefono);
		setEtichetta(etichetta);
	}
	
	/**
	 * metodo get di nome
	 * @return il nome del contatto
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * metodo set di nome
	 * @param nome nome contatto
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * metodo get di numero di telefono
	 * @return il numero di telefono del contatto
	 */
	
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	/**
	 * metodo set di nome
	 * @param numeroTelefono numero di telefono contatto
	 */
	
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	/**
	 * metodo get di etichetta
	 * @return l'etichetta del contatto
	 */
	
	public String getEtichetta() {
		return etichetta;
	}
	
	/**
	 * metodo set di etichetta
	 * @param etichetta= etichetta contatto
	 */
	
	public void setEtichetta(String etichetta) {
		this.etichetta = etichetta;
	}

	@Override
	public String toString() {
		return "Contatto di " + this.nome + " numero: " + this.numeroTelefono + " etichetta: " + this.etichetta;
	}
	
	
	
}
