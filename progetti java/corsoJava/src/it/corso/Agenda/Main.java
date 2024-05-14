package it.corso.Agenda;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.aggiungiElemento("fare spesa");
		agenda.aggiungiElemento("lavare macchina");
		agenda.aggiungiElemento("lavare casa");
		agenda.aggiungiElemento("compra pane");
		agenda.stampa();
		
	}

}
