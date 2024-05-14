package it.corso.java.Esercitazione1;

public class Main4 {

	public static void main(String args[]) {
		int a[]= new int[] {1,3,4,6,5,9};
		System.out.println("massimo dell'array: " + valoreMassimo(a));
		
	}
	
	
	public static int valoreMassimo(int[] arr) {
		int max = arr[0];		
		for(int i = 1; i < arr.length; ++i) {			
			if(arr[i] > max) {
				max = arr[i];
			}
		}		
		return max;
	}
}
