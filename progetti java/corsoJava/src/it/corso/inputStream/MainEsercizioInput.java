package it.corso.inputStream;

import java.io.*;

public class MainEsercizioInput {
	public static void main(String[] args) {	
		
			try {
				BufferedReader input = new BufferedReader(new FileReader("input.txt"));
				String riga;
				while ((riga  = input.readLine()) != null) {					
					contaNumeroParole(riga);
					contaNumeroCarattere(riga);
					contaLunghezzaMedia(riga);
					System.out.println();
							
				}
				
				input.close();
				
			}catch (FileNotFoundException e) {
				System.err.println("file inserito non trovato");
				
			}catch (IOException e) {
				System.err.println("errore nella lettura della stringa");
			}
			
	}
	
	
	public static void contaNumeroParole(String riga) {
		String [] parole = riga.split("\\s+");
		System.out.println("Il numero delle parole è: " + parole.length );
	}
	
	public static void contaNumeroCarattere(String riga) {
		int caratteri = 0;
		String [] parole = riga.split("\\s+");
		
		for (int i = 0; i < parole.length; i++) {
			caratteri += parole[i].length(); 
		}
		 
		System.out.println("Il numero dei caratteri é: " + caratteri);
	}
	
	public static void contaLunghezzaMedia(String riga) {
		double sum = 0;
		
		String [] parole = riga.split("\\s+");
		
		for (int i = 0; i < parole.length; i++) {
			sum += parole[i].length();
		}
		 
		System.out.println("la lunghezza media è: " + (sum /parole.length));
	}

}
