package it.corso.ElencoTelefonico;
/**
 * funzione main per testare il funzionamento di un elenco telefonico
 */
public class Main {

	public static void main(String[] args) {
		GestioneElencoTelefonico elencotel = new GestioneElencoTelefonico();
		
		System.out.println(elencotel.aggiungiContatto(new Contatto("carol","092258412","amica")));
		System.out.println(elencotel.aggiungiContatto(new ContattoPersonale("carola","092258412","amica", "via roma")));
		System.out.println(elencotel.aggiungiContatto(new ContattoLavoro("carol","092258413","capo","best engage")));
		System.out.println(elencotel.ricercaContatto("carol"));
		System.out.println(elencotel.rimuoviContatto("092258413"));
		System.out.println(elencotel.ricercaContatto("carol"));
	}

}
