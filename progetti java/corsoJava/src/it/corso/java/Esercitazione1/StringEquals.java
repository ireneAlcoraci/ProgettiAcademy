package it.corso.java.Esercitazione1;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" inserisci due stringhe: ");

		System.out.println(equals(scan.nextLine(), scan.nextLine()));
		
		scan.close();
	}

	public static boolean equals(String s, String s1) {
		return s.equals(s1);
	}
}
