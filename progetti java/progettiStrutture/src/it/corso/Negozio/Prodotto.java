package it.corso.Negozio;

public class Prodotto {
	private int codice;
	private String descrizione;
	private int quantita;
	private double prezzo;
	
	
	
	public Prodotto(int codice, String descrizione, int quantita, double prezzo) {
		setCodice(codice);
		setDescrizione(descrizione);
		setQuantita(quantita);
		setPrezzo(prezzo);
	}
	
	
	public void setCodice(int codice) {
		this.codice = codice;
		
	} 
	public int getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Prodotto numero " + this.codice + ", \ndescrizione: " + this.descrizione + ", \nquantità: " + this.quantita + ", \nprezzo: €"
				+ this.prezzo; 
	}
	
	
	
}
