package it.corso.StudentGrades;

import java.util.*;


/**
 * Classe che simula la registrazione dei voti degli studenti per una materia
 *  @author Alcoraci Irene
 */

public class StudentGrades {
	private Map<String, Integer> grades;

	public Map<String, Integer> getGrades() {
		if(this.grades == null) {
			return grades = new HashMap<String, Integer>();
		}
		return this.grades;
	}
	
	/**
	 * metodo che inserisce il voto di uno studente
	 * @param studentName nome dello studente
	 * @param grade voto dello studente
	 * @return true se l'operazione va a buon fine false altrimenti
	 */
	
	// try-catch che gestisce le eccezioni che possono essere lanciate dai metodi containsKey e put
	public boolean addGrade(String studentName, int grade) {
		try {
			if(getGrades().containsKey(studentName)) {
				return false;
			}
			 getGrades().put(studentName, grade);
			 return true;
			 
		} catch (Exception e) {
			System.out.println("errore nell'inserimento");
			return false;
		}
		
		
	}
	
	/**
	 * metodo che restituisce il voto di uno specifico studente 
	 * @param studentName nome dello studente
	 * @return il voto se l'operazione va a buon fine -1 altrimenti
	 */
	
	// try-catch che gestisce le eccezioni che possono essere lanciate dai metodi containsKey e get	
	public int getGrade(String studentName) {
		try {
			if(!(getGrades().containsKey(studentName))) {
				return -1;
			}
			 return getGrades().get(studentName);
			 
		} catch (ClassCastException e) {
			System.out.println("inserisci il nome studente corretto");
			return -1;
		}
		
	}
	
	/**
	 * metodo che stampa la lista dei studenti e dei voti per quella materia
	 */
	public void printGrades() {
		 for(Map.Entry<String, Integer> map : getGrades().entrySet()) {
			 System.out.println("nome studente: " + map.getKey() + " \tvoto: " + map.getValue());
		 }
	}
}

	

	