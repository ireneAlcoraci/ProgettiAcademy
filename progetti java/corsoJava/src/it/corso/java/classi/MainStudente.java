package it.corso.java.classi;

public class MainStudente {

	public static void main(String[] args) {
		Studente stu = new Studente("carlo", "alberto");
		System.out.println(stu.getNome());
		System.out.println(stu.getCognome());
		System.out.println(stu.toString());
		
		Studente stu1 = new Studente("mattia", "salvo", "0215478");
		System.out.println(stu1.getNome());
		System.out.println(stu1.getCognome());
		System.out.println(stu1.getMatricola());
		System.out.println(stu1.toString());

	}

}
