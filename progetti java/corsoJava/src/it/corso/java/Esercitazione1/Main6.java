package it.corso.java.Esercitazione1;

import java.util.Random;

public class Main6 {

	public static void main(String[] args) {
		
		int fdado = lanciaDado();
		System.out.println("la faccia del dato è " + fdado);
		
		if(fdado %2 == 0) {
			System.out.println("il valore è pari ");
		}else {
			System.out.println("il valore è dispari ");
		}
		
		if(fdado > 3) {
			System.out.println("il valore è maggiore di tre ");
		}else {
			System.out.println("il valore è minore o uguale a tre");
		}
		
	}
	public static int lanciaDado() {
		Random ran = new Random();
		return ran.nextInt(6) + 1;
	}

}
