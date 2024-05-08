package it.corso.aereoporto;

public class VoloTest {

	public static void main(String[] args) {
		Aereoporto a = new Aereoporto("Malpensa","Milano", "PSA");
		System.out.println(a.infoAeroporto());
		System.out.println();
		
		Passegero p = new Passegero("mario rossi", "italiano", "AZ124", "15D", "vegetariano");
		System.out.println(p.infoPassegero());
		System.out.println(p.cambiaPosto("13F"));
		System.out.println();
		System.out.println(p.infoPassegero());
		System.out.println();


		Volo v = new Volo("AZ124", a, new Aereoporto("Heathrow","Londra", "PSA"), "Airbus200", 5);
		System.out.println(v.addPassegero(p));
		System.out.println(v.addPassegero(new Passegero("mario gialli", "italiano", "AZ124", "17F", "vegano")));
		System.out.println(v.addPassegero(new Passegero("matt smith", "inglese", "AZ124", "7G", "vegetariano")));
		System.out.println(v.addPassegero(new Passegero("marco verdi", "italiano", "AZ124", "4E", "onnivoro")));
		System.out.println(v.addPassegero(new Passegero("teresa gallo", "italiano", "AZ125", "13A", "onnivoro")));
		System.out.println(v.addPassegero(new Passegero("carola lorenzini", "italiano", "AZ124", "18C", "vegetariano")));
		System.out.println(v.addPassegero(new Passegero("giammarco lorenzini", "italiano", "AZ124", "17D", "vegetariano")));
		System.out.println();
		System.out.println(v.infoVolo());
		System.out.println(v.getElencoPassegeri());
		System.out.println(v.getPostiVegetariani());
		
		VoloNonDiretto vnd = new VoloNonDiretto("AZ124", a, new Aereoporto("Heathrow","Londra", "PSA"), "Airbus200", 5, 2);
		System.out.println(vnd.addScalo(new Aereoporto("Fiumicino","Roma", "PSA")));
		System.out.println(vnd.addScalo(new Aereoporto("Marco Polo","Venezia", "PSA")));
		System.out.println(vnd.addScalo(new Aereoporto("Linate","Milano", "PSA")));
		System.out.println(vnd.infoVoloNonDiretto());
		
	}

}
