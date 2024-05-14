package it.corso.esercizioFilm;

public class MainFilm {

	public static void main(String[] args) {
		Videoteca v = new Videoteca("carloDvd","via roma","carlo", 3);
		System.out.println(v.aggiungiFilmDvd(new FilmDvd("Harry potter 1", "carlo", "eng", 2010, "eg", 5, 2)));
		System.out.println(v.aggiungiFilmDvd(new FilmDvd("Harry potter 2", "carlo", "eng", 2010, "eg", 3, 2)));
		System.out.println(v.aggiungiFilmDvd(new FilmDvd("Harry potter 3", "carlo", "eng", 2010, "eg", 3, 2)));
		System.out.println(v.aggiungiFilmDvd(new FilmDvd("Harry potter 4", "carlo", "eng", 2010, "eg", 3, 2)));
		
		System.out.println(v.getElenco());
		System.out.println(v.verificaFilm(new Film("Harry potter 1", "carlo", 2010, "eg")));
		System.out.println(v.verificaFilm(new Film("Harry potter", "carlo", 2010, "eg")));
		
		FilmDvd fd = new FilmDvd("Harry potter 1", "carlo", "eng", 2010, "eg", 5, 2);
		System.out.println(fd.toString());
	}

}
