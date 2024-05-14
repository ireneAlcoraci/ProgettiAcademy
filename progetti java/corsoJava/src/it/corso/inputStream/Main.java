package it.corso.inputStream;
import java .io.*;
public class Main {

	public static void main(String[] args) {
		byte [] array = new byte[100];
		
		try {
			// se il file è nello stesso package si scrive il nome del file dentro FileInputStream
			//InputStream input = new FileInputStream((System.getProperty("user.home") + "/Desktop/input.txt")); se il file non si trova nella stessa cartella ma comunque all'interno del siatema user
			
			InputStream input = new FileInputStream("input.txt");
			
			System.out.println("Byte disponibile nel file: " + input.available());
			
			int byteRead = input.read(array);
			System.out.println("i dati vengolo letti dal file: " );
			
			String data = new String (array,0, byteRead);
			System.out.println(data);
			
			
			input.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
