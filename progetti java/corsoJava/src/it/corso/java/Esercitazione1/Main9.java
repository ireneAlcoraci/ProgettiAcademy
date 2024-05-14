package it.corso.java.Esercitazione1;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci un numero tra 1 e 7: ");
		
		switch(scan.nextInt()) {
		case 1:
			System.out.println("lunedì ");
			break;
		case 2:
			System.out.println("martedì ");
			break;
		case 3:
			System.out.println("mercoledì ");
			break;
		case 4:
			System.out.println("giovedì ");
			break;
		case 5:
			System.out.println("venerdì ");
			break;
		case 6:
			System.out.println("sabato ");
			break;
		case 7:
			System.out.println("domenica ");
			break;
		default:
			System.out.println("non hai inserito un numero tra 1 e 7 ");
		

		}
		
		scan.close();
	}

}
