package it.corso.libro;

public class MainLibro {

	public static void main(String[] args) {
		Libro libro = new Libro("Manuale java","de sio cesarini", 2019);		
		libro.getInfo();
		System.out.println(libro.ottieniInfo());
		
		System.out.println("");
		
		Libro libro1 = new Libro("Manuale java","de sio cesarini", "65881258" , 2019);
		libro1.getInfo();
		System.out.println(libro1.ottieniInfo());
	}

}
