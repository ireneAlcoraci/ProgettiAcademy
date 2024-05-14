package it.corso.Negozio;


public class ProdottoElettronico extends Prodotto {
	private int garanzia;

	public ProdottoElettronico(int codice, String descrizione, int quantita, double prezzo, int garanzia) {
		super(codice, descrizione, quantita, prezzo);
		setGaranzia(garanzia);
	}

	public int getGaranzia() {
		return garanzia;
	}

	public void setGaranzia(int garanzia) {
		if(garanzia >= 0) {
			this.garanzia = garanzia;
		}else {
			System.out.println("inserire valore positivo");
		}
		
	}

	@Override
	public String toString() {
		return super.toString() + ", \ngaranzia: " + this.garanzia + " mesi";
	}
	
	

}
