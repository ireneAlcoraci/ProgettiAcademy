package it.corso.java;

public class Main8 {

	public static void main(String[] args) {
		String [] s = new String[] {"tabella", "cappello", "cassetta", "barattolo"};


		for( int i = 0; i < s.length; ++i) {
			for(int j = 1; j < s[i].length(); ++j) {
				if(s[i].charAt(j - 1) == s[i].charAt(j)) {
					if(s[i].charAt(j - 1) == 'p' || s[i].charAt(j - 1) == 's') {
						System.out.println(" c'è una doppia " + s[i].charAt(j) + "!" );
						continue;
					}
					
					System.out.println(" le doppie sono " + s[i].charAt(j) + s[i].charAt(j) );
				}
				
			}
			
		}
	}

}
