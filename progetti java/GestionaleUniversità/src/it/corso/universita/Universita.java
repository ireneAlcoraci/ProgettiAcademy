package it.corso.universita;

import java.util.ArrayList;
/**
 * classe che identifica il concetto di universita
 */
public class Universita {
	private ArrayList<Studente> listaStudenti;
	private ArrayList<Professore> listaProfessori;
	private ArrayList<Corso> listaCorsi;	
	/**
	 * costruttore che istanzia le tre liste una per gli studenti, una per i professori e l'altra per i corsi
	 */
	public Universita() {
		this.listaStudenti = new ArrayList<>();
		this.listaProfessori = new ArrayList<>();
		this.listaCorsi = new ArrayList<>();				
	}
		
	public ArrayList<Studente> getListaStudenti() {
		return listaStudenti;
	}


	public ArrayList<Professore> getListaProfessori() {
		return listaProfessori;
	}


	public ArrayList<Corso> getListaCorsi() {
		return listaCorsi;
	}

	/**
	 * metodo per l'inserimento dell'oggetto studente all'interno della lista di studenti inscritti all'universita
	 * @param s studente di tipo Studente
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	public boolean aggiungiStudente(Studente s) {
		for(Studente studente : listaStudenti) {
			if(studente.getIDUnivoco().equals(s.getIDUnivoco())) {
				return false;
			}
		}
		return listaStudenti.add(s);
	}
	
	/**
	 * metodo che inserisce l'oggetto professore all'interno della lista dei professori assunti all'universita 
	 * @param p professore tioi Professore
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	public boolean aggiungiProfessore(Professore p) {
		for(Professore professore : listaProfessori) {
			if(professore.getIDUnivoco().equals(p.getIDUnivoco())) {
				return false;
			}
		}
		return listaProfessori.add(p);
	}
	
	/**
	 * metodo che inserisce l'oggetto corso alla lista dei corsi dell'universita
	 * @param c corso tipo Corso
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	
	public boolean aggiungiCorso(Corso c) {
		for(Corso corso : listaCorsi) {
			if(corso.getCodiceCorso().equals(c.getCodiceCorso())) {
				return false;
			}
		}
		return listaCorsi.add(c);
	}
	
	/**
	 * metodo che inserisce uno studente in un corso 
	 * @param c corso tipo Corso
	 * @param s studente tipo Studente
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	public boolean aggiungiStudenteCorso(Corso c, Studente s) {
		if(listaCorsi.contains(c) && listaStudenti.contains(s) && c.getStudentiCorso().size() < c.getMaxNumeroStudenti()) {
				return s.inscrizioneCorso(c);
		}
		
		return false;
	}
	
	/**
	 * metodo che assegna un professore al corso in input
	 * @param c corso tipo Corso
	 * @param p professore tipo Professore
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	public boolean assegnaProfessoreCorso(Corso c, Professore p) {
		if(listaCorsi.contains(c) && listaProfessori.contains(p) && c.getProfessoreTitolare() == null) {
			return p.aggiungiCorso(c);
		}
		return false;
	}
}
