package it.corso.java;

public class Main4 {

	public static void main(String[] args) {
		String [] s = new String[] {"tabella", "casella", "bambina", "barattolo"};
		String c = "";
		
		for( int i = 0; i < s.length; ++i) {
			for(int j = 0; j < s[i].length(); ++j) {
				if(s[i].charAt(j) == 'a' || s[i].charAt(j) == 'b') {
					c += s[i].charAt(j);
				}
				
			}
			System.out.println(c);
			c= "";
		}
		
		
	}

}
