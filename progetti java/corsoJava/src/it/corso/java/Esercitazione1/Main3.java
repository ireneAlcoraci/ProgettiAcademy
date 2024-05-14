package it.corso.java.Esercitazione1;

import java.util.Random;

public class Main3 {
//cambiare generando una password non solo di numeri
	public static void main(String[] args) {
		System.out.println(generaPasswordCasuale());

	}
	
	public static String generaPasswordCasuale() {
		Random ran = new Random();
		String caratteri = "abcdefghilmnopqrstuvzxwjy!?&%$@[]{}<>()";
		String c = "";
		for(int i = 0; i< 10; ++i) {
			c += caratteri.charAt(ran.nextInt(caratteri.length() - 1 ));
			c += ran.nextInt(9);
		}
		return c;
	}

}
