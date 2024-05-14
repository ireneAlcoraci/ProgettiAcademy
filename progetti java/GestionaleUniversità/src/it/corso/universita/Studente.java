package it.corso.universita;

import java.util.ArrayList;
/**
 * classe che identifica un generico studente estendendo la classe Persona
 */
public class Studente extends Persona {
	private int annoImmatricolazione;
	private ArrayList<Corso> listaCorsi;

	/**
	 * costruttore che prende in ingresso i valori della superclasse Persona oltre a istanziare la lista dei corsi dello studente
	 * @param nome nome dello studente tipo string
	 * @param cognome cognome dello studente tipo  string
	 * @param iDUnivoco id univoco dello studente tipo  string
	 * @param annoImmatricolazione anno di immatricolazione dello studente tipo  int
	 */
	public Studente(String nome, String cognome, String iDUnivoco, int annoImmatricolazione) {
		super(nome, cognome, iDUnivoco);
		setAnnoImmatricolazione(annoImmatricolazione);
		listaCorsi = new ArrayList<>();
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}
	
	public ArrayList<Corso> getListaCorsi() {
		return listaCorsi;
	}

	public void setListaCorsi(ArrayList<Corso> listaCorsi) {
		this.listaCorsi = listaCorsi;
	}

	/**
	 * metodo che permette l'iscrizione ad un corso da parte dello studente
	 * @param c corso a cui si vuole iscrivere lo studente di tipo Corso
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	public boolean inscrizioneCorso(Corso c) {
		if(!(listaCorsi.contains(c))) {
			listaCorsi.add(c);
			return c.aggiungiStudenteCorso(this);
		}
		return false;
	}
	
	/**
	 * metodo che permette di rimuovere l'iscrizione ad un corso da parte dello studente
	 * @param c corso lo studente vuole rimuovere di tipo Corso
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	
	public boolean rimozioneCorso(Corso c) {
		if(listaCorsi.contains(c)) {
			listaCorsi.remove(c);
			return c.rimuoviStudenteCorso(this);
		}
		return false;
	}
	
/**
 * metodo toString che non prende niente in ingresso e restituisce una stringa con le informazioni del generico studente richiamando
 * il metodo toString della superclasse
 */
	@Override
	public String toString() {
		return "Studente matricola " + super.toString() + ", anno di immatricolazione: " + this.annoImmatricolazione + ", listaCorsi: " + this.listaCorsi.toString() + "\n";
	}
	
	
	
	

}
