package it.corso.java.Esercitazione1;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pass = "";
				
		do {
			System.out.println("inserisci una password: ");
			pass = scan.nextLine();

		}while(!checkPassword(pass));
	
		scan.close();
	
	}

	public static boolean checkPassword(String s) {
		for(int i = 0; i<s.length(); ++i) {
			if(s.charAt(i) == '&' || s.charAt(i) == '$' || s.charAt(i) == '@' && s.length() >= 8) {
				System.out.println("PASSWORD CREATA");
				return true;
			}
		}
		
		System.out.println("inserire password lunga più di 8 caratteri e con caratteri speciali & @ $");
		return false;
	}
}
