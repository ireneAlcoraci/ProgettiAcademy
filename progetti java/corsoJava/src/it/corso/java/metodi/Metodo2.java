package it.corso.java.metodi;

public class Metodo2 {
	
	public String intermezzaStringa(String s, char c) {
		String prova = " ";
		if(s.equals("")) {
			System.out.println("inserisci una stringa diversa da null");
		}else {
			for(int i = 0; i < s.length(); ++i) {
				prova += s.charAt(i);
				if(i != s.length() - 1) {
					prova += c;
				}
				
			}
			return prova;
		}
		return prova;
	}
	
	public static int fibonacciRicorsivo(int n) {
		if(n < 0) {
			return -1;
		}
		if(n == 1 || n == 0) {
			return 1;
		}else {
			return fibonacciRicorsivo(n-1) + fibonacciRicorsivo(n-2);
		}
	}
	
	public static int fibonacci(int n) {
		int n1 = 0, n2 = 1,n3 = 0;
		
		if(n < 0) {
			return -1;
		}		
        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
	    
	}
}
