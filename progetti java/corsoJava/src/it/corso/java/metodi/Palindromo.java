package it.corso.java.metodi;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("inserire una parola: ");
		 
		 String parola = scan.nextLine();
		 
		 if(isPalindromo(parola)) {
			 System.out.println("parola palindroma");
		 }else {
			 System.out.println("parola non palindroma");
		 }
		 
		 scan.close();
	}
	
	public static boolean isPalindromo(String parola) {
		for(int i = 0, j = parola.length() - 1; i < j; i++, j--) {
				 if(parola.charAt(i) != parola.charAt(j)) {
					 return false;
				 }
		 }
		return true;
	}
	
}
