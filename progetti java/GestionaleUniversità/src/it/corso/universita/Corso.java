package it.corso.universita;

import java.util.ArrayList;
/**
 * classe che identifica una generico corso universitario
 */
public class Corso {
	private String titolo;
	private String codiceCorso;
	private Professore professoreTitolare;
	private int maxNumeroStudenti;
	private ArrayList<Studente> studentiCorso;
	/**
	 * costruttore che prende in ingresso il titolo, il codice e il numero massimo di studenti per il corso 
	 * e che istanzia la lista degli studenti inscritti
	 * @param titolo titolo del corso tipo String
	 * @param codiceCorso codice del corso tipo String
	 * @param professoreTitolare professore del corso tipo Professore
	 * @param maxNumeroStudenti numero massimo di studenti iscritti tipo Int
	 */
	
	public Corso(String titolo, String codiceCorso, int maxNumeroStudenti) {
		setTitolo(titolo);
		setCodiceCorso(codiceCorso);
		setMaxNumeroStudenti(maxNumeroStudenti);
		studentiCorso = new ArrayList<Studente>();
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getCodiceCorso() {
		return codiceCorso;
	}
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	public Professore getProfessoreTitolare() {
		return professoreTitolare;
	}
	
	// un corso ha un unico professore allora si imposta il professore con il metodo set
	public void setProfessoreTitolare(Professore professoreTitolare) {
		this.professoreTitolare = professoreTitolare;
	}
	
	public int getMaxNumeroStudenti() {
		return maxNumeroStudenti;
	}
	public void setMaxNumeroStudenti(int maxNumeroStrudenti) {
		this.maxNumeroStudenti = maxNumeroStrudenti;
	}
	
	public ArrayList<Studente> getStudentiCorso() {
		return studentiCorso;
	}

	/**
	 * metodo che inserisce uno studente in un corso
	 * @param s studente tipo Studente
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	
	//controlla se lo studente presente nella lista degli studenti al corso e se 
	//il numero di studenti inscritti non maggiore del numero massimo di studenti prima di inserirlo 
	public boolean aggiungiStudenteCorso(Studente s) {
		if(studentiCorso.size() < this.maxNumeroStudenti && !(studentiCorso.contains(s))) {
			return studentiCorso.add(s);
		}
		return false;
		
	}
	/**
	 * metodo che rimuove uno studente da un corso frequentato
	 * @param s studente di tipo Studente
	 * @return restituisce true se l'operazione riuscita false altrimenti
	 */
	
	//controlla se lo studente presente nella lista degli studenti al corso prima di eliminarlo 
	public boolean rimuoviStudenteCorso(Studente s) {
		if(studentiCorso.contains(s)) {
			 return studentiCorso.remove(s);
		}
		return false;
	}
	
	/**
	 * metodo che rimuove un professore da un corso
	 */
	public void rimuoviProfessore() {
		this.professoreTitolare = null;
	}

	/**
	 * metodo toString che non prende niente in ingresso e restituisce una stringa con le informazioni del generico corso richiamando
	 * il metodo toString della superclasse 
	 */
	@Override
	public String toString() {
		return "Corso " + this.codiceCorso + " di " + this.titolo +  ", professore del corso: " + this.professoreTitolare.getNome() + " "+ this.professoreTitolare.getCognome()
				+ ", numero massimo studenti: " + this.maxNumeroStudenti + "\n";
	}
	
	
	
}
