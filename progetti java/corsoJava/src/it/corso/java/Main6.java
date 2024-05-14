package it.corso.java;

public class Main6 {

	public static void main(String[] args) {
		int sum = 0;
		int cont = 0;
		
		for(int i = 1; i <= 1000; ++i) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				++cont;
				sum += i;
				if(cont == 5) {
					System.out.println(sum);
					break;
				}
			
			}
		}

	}

}
