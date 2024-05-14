package it.corso.universita;

public class Main {

	public static void main(String[] args) {
		//creo oggetto universita
		Universita u = new Universita();
		
		//creo e inserisco gli studenti nella apposita lista della classe universita
		Studente s1 = new Studente("carlo","verdi", "S12345", 2016);
		Studente s2 = new Studente("giorgia","gialli", "S12350", 2016);
		Studente s3 = new Studente("mario","rossi", "S12340", 2016);
		
		System.out.println(u.aggiungiStudente(s1));
		System.out.println(u.aggiungiStudente(s2));
		System.out.println(u.aggiungiStudente(s3));
		System.out.println(u.getListaStudenti());
		
		//creo e inserisco i professori nella apposita lista della classe universita
		Professore p1 = new Professore("giovanni", "aglio", "P24568");
		Professore p2 = new Professore("carlo", "podio", "P24421");
		Professore p3 = new Professore("elisa", "porte", "P24875");
		
		System.out.println(u.aggiungiProfessore(p1));
		System.out.println(u.aggiungiProfessore(p2));
		System.out.println(u.aggiungiProfessore(p3));
		System.out.println(u.getListaProfessori());
		
		//creo e inserisco i corsi nella apposita lista della classe universita
		Corso c1 = new Corso("analisi", "C5152", 10);
		Corso c2 = new Corso("fisica", "C5153", 10);
		Corso c3 = new Corso("anatomia", "C5154", 10);
		System.out.println("inserimento corsi: ");
		System.out.println(u.aggiungiCorso(c1));
		System.out.println(u.aggiungiCorso(c2));
		System.out.println(u.aggiungiCorso(c3));

		System.out.println("assegnazione professori al corso: ");
		System.out.println(u.assegnaProfessoreCorso(c1, p3));
		System.out.println(u.assegnaProfessoreCorso(c2, p3));
		System.out.println(u.assegnaProfessoreCorso(c3, p1));
		System.out.println(u.getListaCorsi());
		//aggiungo studenti ai corsi
		System.out.println(u.aggiungiStudenteCorso(c3, s1));
		System.out.println(u.aggiungiStudenteCorso(c2, s1));
		System.out.println(u.aggiungiStudenteCorso(c3, s2));
		
		System.out.println("stampa lista studenti: ");
		System.out.println(u.getListaStudenti());
		System.out.println("stampa lista professori: ");
		System.out.println(u.getListaProfessori());
		
	}

}
