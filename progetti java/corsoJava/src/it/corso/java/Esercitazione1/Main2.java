package it.corso.java.Esercitazione1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" inserisci una frase e una stringa: ");
		String f = scan.nextLine();
		String s = scan.nextLine();
		
		System.out.println(f.contains(s));
		System.out.println(f.toUpperCase());

		
		scan.close();

	}
	

}
