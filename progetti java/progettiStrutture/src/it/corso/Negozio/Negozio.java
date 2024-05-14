package it.corso.Negozio;

import java.util.ArrayList;

public class Negozio {
	private ArrayList<Prodotto> elencoProdotti;
	
	public Negozio() {
		this.elencoProdotti = new ArrayList<>();
	}

	public ArrayList<Prodotto> getElencoProdotti() {
		return elencoProdotti;
	}

	public void setElencoProdotti(ArrayList<Prodotto> elencoProdotti) {
		this.elencoProdotti = elencoProdotti;
	}

	public String aggiungiProdotto(Prodotto p) {
		for (int i = 0; i < elencoProdotti.size() ; ++i) {
			if(elencoProdotti.get(i).getCodice() == p.getCodice()) {
				 return "impossibile aggiundere prodotto, modificare id";
			}			
		}
		
		if(elencoProdotti.add(p)) {
			return "prodotto inserito";
		}else {
			return "impossibile aggiundere prodotto";
		}
	}
	
	public String modificaQuantita(int id, int quantita) {
		for (int i = 0; i < elencoProdotti.size(); ++i) {
			if(elencoProdotti.get(i).getCodice() == id) {
				elencoProdotti.get(i).setQuantita(quantita);
				return "la nuova quantità per il prodotto " + elencoProdotti.get(i).getCodice() + " è " + elencoProdotti.get(i).getQuantita();
				 
			}
			
		}
		return "prodotto non presente nella lista";
		
	}
	
	public String eliminaProdotto(int codice) {
		for (int i = 0; i < elencoProdotti.size(); ++i) {
			if(elencoProdotti.get(i).getCodice() == codice) {
				Prodotto p = elencoProdotti.remove(i);
				 return "Rimosso prodotto codice " + p.getCodice();
			}
			
		}
		return "errore rimozione";
	}
	
	public String visualizzaProdotti() {
		String elenco = "";
		for(Prodotto prodotto : elencoProdotti) {
			elenco += prodotto.toString() + "\n\n";
		}
		
		if(elenco.equals("")) {
			return "nessuno prodotto inserito";
		}
		
		return elenco;				
		
	}
	
	public String visualizzaProdotto(int id) {
		String elenco = "";
		for (int i = 0; i < elencoProdotti.size(); ++i) {
			if(elencoProdotti.get(i).getCodice() == id) {
				 elenco += elencoProdotti.get(i).toString() + "\n\n";
			}						
		}
		
		if(elenco.equals("")) {
			return "nessuno prodotto con questo id";
		}else {
			return elenco;
		}		
		
	}
}
