package it.corso.Negozio;

import java.time.LocalDate;

public class ProdottoAlimentare extends Prodotto {
	private LocalDate dataScadenza;
	
	
	public ProdottoAlimentare(int codice, String descrizione, int quantita, double prezzo, LocalDate dataScadenza) {
		super(codice, descrizione, quantita, prezzo);
		setDataScadenza(dataScadenza);
	}


	public LocalDate getDataScadenza() {
		return dataScadenza;
	}


	public void setDataScadenza(LocalDate dataScadenza) {
		if(!(dataScadenza.equals(LocalDate.now()))) {
			this.dataScadenza = dataScadenza;
		}else {
			System.out.println("inserire data maggiore di quella di oggi");
		}
			
		
		
	}


	@Override
	public String toString() {
		return super.toString() +  ", \ndata di scadenza: " + this.dataScadenza;
	}
	
	

}
