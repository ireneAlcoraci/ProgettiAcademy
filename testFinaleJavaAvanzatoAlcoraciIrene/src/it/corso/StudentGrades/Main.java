package it.corso.StudentGrades;
/**
 * classe main che testa il funzionamento della classe StudentGrades
 *
 */
public class Main {

	public static void main(String[] args) {
		StudentGrades student = new StudentGrades();
		
		System.out.println(student.addGrade("giorgio", 30));
		System.out.println(student.addGrade("marco", 20));
		System.out.println(student.addGrade("teresa", 25));
		System.out.println(student.addGrade("sara", 28));
		System.out.println(student.addGrade("emma", 18));
		System.out.println(student.addGrade("giorgio", 30));
		
		System.out.println(student.getGrade("giorgio"));
		System.out.println(student.getGrade("franco"));
		
		student.printGrades();



		

	}

}
