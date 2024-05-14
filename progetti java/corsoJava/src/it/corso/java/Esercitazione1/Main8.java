package it.corso.java.Esercitazione1;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci i coefficenti di una equazione quadratica: ");
		double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
		
		
		double delta = b*b - 4 *a*c;
		double x1 = 0, x2 = 0;
		
		if(delta > 0){
			x1 = (-b + Math.sqrt(delta)) / 2*a;
			x2 = (-b - Math.sqrt(delta)) / 2*a;
			System.out.println("delta maggiore di 0");
			System.out.println("x1: " + x1 + " x2:" + x2);
		}else if(delta == 0) {
			x1 =  (-b ) / 2*a;
			System.out.println("delta minore di 0");
			System.out.println("x: " + x1);
		}else {
			System.out.println("non ci sono soluzioni reali");
		}
		
		scan.close();
	}

}
