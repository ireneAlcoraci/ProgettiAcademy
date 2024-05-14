package it.corso.java.Esercitazione1;

public class Main5 {

	public static void main(String[] args) {
		int a[]= new int[] {1,3,4,6,5,9};
		System.out.println("la somma è " + sum(a));

	}

	public static int sum(int[] arr) {
		int sum = 0;		
		for(int i = 0; i < arr.length; ++i) {			
			sum += arr[i];
		}		
		return sum;
	}
}
