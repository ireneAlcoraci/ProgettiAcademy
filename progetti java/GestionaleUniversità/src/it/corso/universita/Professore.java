package it.corso.universita;

import java.util.ArrayList;
/**
 * classe che identifica un generico professore estendendo la classe Persona
 */
public class Professore extends Persona {
	private ArrayList<Corso> listaCorsiInsegnati;
	
	/**
	 * costruttore che prende in ingresso i valori della superclasse Persona oltre ad istanziare la lista dei corsi insegnati
	 * @param nome nome de professore tipo string
	 * @param cognome cognome del professore tipo  string
	 * @param iDUnivoco id univoco del professore tipo  string
	 */
	public Professore(String nome, String cognome, String iDUnivoco) {
		super(nome, cognome, iDUnivoco);
		listaCorsiInsegnati = new ArrayList<>();
	}

	public ArrayList<Corso> getListaCorsiInsegnati() {
		return listaCorsiInsegnati;
	}

	public void setListaCorsiInsegnati(ArrayList<Corso> listaCorsiInsegnati) {
		this.listaCorsiInsegnati = listaCorsiInsegnati;
	}
	
	/**
	 * metodo che permette di inserire un corso nella lista dei corsi insegnati
	 * @param c corso da inserire di tipo Corso
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */

	public boolean aggiungiCorso(Corso c) {
			if(!(listaCorsiInsegnati.contains(c))) {
				listaCorsiInsegnati.add(c);
				c.setProfessoreTitolare(this);
				return true;
			}
			
		return false;
	}
	
	/**
	 * metodo che permette di rimuovere un corso nella lista dei corsi insegnati
	 * @param c corso da rimuovere di tipo Corso
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	public boolean rimozioneCorso(Corso c) {
		if(listaCorsiInsegnati.contains(c)) {
			listaCorsiInsegnati.remove(c);
			c.rimuoviProfessore();
			return true;
		}
		
		return false;
	}

	/**
	 * metodo toString che non prende niente in ingresso e restituisce una stringa con le informazioni del generico professore richiamando
	 * il metodo toString della superclasse
	 */
	@Override
	public String toString() {
		return "Professore " + super.toString() + " lista corsi insegnati: " + this.listaCorsiInsegnati.toString() + "\n";
	}
	
	
}
