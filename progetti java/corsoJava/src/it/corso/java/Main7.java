package it.corso.java;

public class Main7 {

	public static void main(String[] args) {
		int sum = 0;
		int cont = 0;
		int i = 0;
		boolean sumPari = true;
		
		while(cont != 150) {
			
			if(sum % 2 == 1 && sum > 6000) {
				System.out.println("sono fuori dal ciclo");
				break;
			}
			
			if(sum > 4000 && sumPari) {
				++sum;
				sumPari = false;
				System.out.println("la somma è dispari");
			}
			
			if(i % 2 == 0) {				
				sum += i;
				++cont;
				System.out.println("numero pari: " + i + " somma: " + sum);
				i += 2;
			}
			
			
		}		
		

	}

}
