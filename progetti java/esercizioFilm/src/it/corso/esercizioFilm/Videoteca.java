package it.corso.esercizioFilm;

public class Videoteca {
	private String nome;
	private String indirizzo;
	private String nomeProprietario;
	private FilmDvd [] elencoFilm;
	private int cont = 0;
	
	public Videoteca() {

	}
	
	public Videoteca(String nome, String indirizzo, String nomeProprietario, int maxElencoFilm) {
		setNome(nome);
		setIndirizzo(indirizzo);
		setNomeProprietario(nomeProprietario);
		elencoFilm = new FilmDvd [maxElencoFilm];
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public FilmDvd[] getElencoFilm() {
		return elencoFilm;
	}

	public void setElencoFilm(FilmDvd[] elencoFilm) {
		this.elencoFilm = elencoFilm;
	}
	
	//inserisce in dvd nell'elenco
	public boolean aggiungiFilmDvd(FilmDvd fd) {
		if(this.elencoFilm.length == cont) {
			return false;
		}else {
			for(int i = 0; i < this.elencoFilm.length; ++i) {			
				if(this.elencoFilm[i] == null) {
					this.elencoFilm[i] = fd;
					++cont;
					break;
				}					
			}	
			return true;
		}
	}
	
	//verifica se il film in input è presente nell'elenco
	public boolean verificaFilm(Film f) {
		for(int i = 0; i < this.elencoFilm.length; ++i) {			
			if(this.elencoFilm[i].eq(f)){
				return true;
			}
		}
		return false;
	}
	
	public String getElenco() {
		String elenco = "";
		for(int i = 0; i < this.elencoFilm.length; ++i) {
			if(elencoFilm[i] != null) {
				elenco += " Film " + i + ": " + elencoFilm[i].getTitolo() + "\r\n";
			}					
		}
		return elenco;
		
	}

}
