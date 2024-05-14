package it.corso.java.metodi;

public class Metodo {

	public boolean trovaCarattereNellaStringa(char c, String s) {			
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}
	
	public int numeroOccorrenze(char c, String s) {			
		int cont = 0;
		
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == c) {
				++cont;
			}
		}
		return cont;
	}
	
	public int trovaPosizioneCarattereNellaStringa(char c, String s) {			
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean confrontaCaratteriNellaStringa(char c1, char c2, String s) {			
		for(int i = 0; i < s.length(); ++i) {
			if(numeroOccorrenze(c1, s) == numeroOccorrenze(c2, s)) {
				return true;
			}
		}
		return false;
	}
}


