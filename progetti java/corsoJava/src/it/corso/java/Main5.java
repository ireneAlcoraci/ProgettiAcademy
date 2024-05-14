package it.corso.java;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci un numero: ");
		
		switch(scan.nextInt()) {
			case 0:
				System.out.println("ZERO ");
				break;
			case 1:
				System.out.println("UNO ");
				break;
			case 2:
				System.out.println("DUE ");
				break;
			case 3:
				System.out.println("TRE ");
				break;
			case 4:
				System.out.println("QUATTRO ");
				break;
			case 5:
				System.out.println("CINQUE ");
				break;
			case 6:
				System.out.println("SEI ");
				break;
			case 7:
				System.out.println("SETTE ");
				break;
			case 8:
				System.out.println("OTTO ");
				break;
			case 9:
				System.out.println("NOVE ");
				break;
			default:
				System.out.println("OTHER ");
					
		
		}
		
		scan.close();

	}

}
