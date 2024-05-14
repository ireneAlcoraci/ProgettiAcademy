package it.corso.universita;
/**
 * classe che identifica una generica persona	
 */
public class Persona {
	private String nome;
	private String cognome;
	private String IDUnivoco;
	
	/**
	 * costruttore che prende in ingresso tre parametri
	 * @param nome nome della persona tipo string
	 * @param cognome cognome della persona tipo string
	 * @param iDUnivoco identificativo univoto tipo string
	 */
	public Persona(String nome, String cognome, String iDUnivoco) {
		setNome(nome);
		setCognome(cognome);
		setIDUnivoco(iDUnivoco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIDUnivoco() {
		return IDUnivoco;
	}

	public void setIDUnivoco(String iDUnivoco) {
		IDUnivoco = iDUnivoco;
	}

	/**
	 * metodo toString che non prende niente in ingresso e restituisce una stringa con le informazioni della generali della persona
	 */
	@Override
	public String toString() {
		return this.IDUnivoco + " " + this.nome + " " + this.cognome;
	}
	
	
	
}
