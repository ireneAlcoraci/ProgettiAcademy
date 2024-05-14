package it.corso.java;

public class Main9 {

	public static void main(String[] args) {
		String [] s = new String[] {"tabella", "cappello", "cassetta", "barattolo"};

		//prova1(s);
		prova2(s);
		
		
		

	}
	
	public static int contaNumeroCarattere(String s, char c) {
		char arr[] = s.toCharArray();
		int cont = 0;
		
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] == c) {
				++cont;
			}
		}
		return cont;
	}
	
	public static void prova1(String s[]) {
		for( int i = 0; i < s.length; ++i) {
			for(int j = 1; j < s[i].length(); ++j) {
										
				if(s[i].charAt(j - 1) == s[i].charAt(j) || contaNumeroCarattere(s[i], s[i].charAt(j)) > 1) {					
					if(s[i].charAt(j - 1) == 'p' || s[i].charAt(j - 1) == 's') {
						System.out.println("c'è una doppia " + s[i].charAt(j) + "!" );
						continue;
					}
					
					System.out.println(" le doppie sono " + s[i].charAt(j) + s[i].charAt(j) );
				}
				
			}
			
		}
	}
	
	
	public static void prova2(String s[]) {
		for( int i = 0; i < s.length; ++i) {
			for(int j = 0; j < s[i].length() ; ++j) {
				for(int k = j +1; k < s[i].length(); ++k) {
					
					if(s[i].charAt(j) == s[i].charAt(k)) {					
						if(s[i].charAt(j) == 'p' || s[i].charAt(j) == 's') {
							System.out.println("c'è una doppia " + s[i].charAt(j) + "!" );
							continue;
						}
						
						System.out.println(" le doppie sono " + s[i].charAt(j) + s[i].charAt(j) );
					}
				}
				
				
			}
			
		}
	}

}
