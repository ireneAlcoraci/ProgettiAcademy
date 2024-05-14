package it.corso.esercizioFilm;


public class FilmDvd extends Film {
	private String elencoLingueAudio[];
	private String elencoLingueSottotitolo[];
	private boolean bonus; 
	
	
	public FilmDvd() {
		
	}

	public FilmDvd(String titolo, String nomeRegista, String linguaOrigine, int anno, String nazione,int dimAudio, int dimSottotitolo) {
		super(titolo,nomeRegista,linguaOrigine,anno,nazione);
		this.elencoLingueAudio = new String[dimAudio];
		this.elencoLingueSottotitolo = new String[dimSottotitolo];
	}

	public FilmDvd(String titolo, String nomeRegista, String linguaOrigine, int anno, String nazione, int dimAudio, int dimSottotitolo, boolean bonus) {
		super(titolo,nomeRegista,linguaOrigine,anno,nazione);
		this.elencoLingueAudio = new String[dimAudio];
		this.elencoLingueSottotitolo = new String[dimSottotitolo];
		setBonus(bonus);
	}


	public String[] getElencoLingueAudio() {
		return elencoLingueAudio;
	}


	public void setElencoLingueAudio(String[] elencoLingueAudio) {
		this.elencoLingueAudio = elencoLingueAudio;
	}


	public String[] getElencoLingueSottotitolo() {
		return elencoLingueSottotitolo;
	}


	public void setElencoLingueSottotitolo(String[] elencoLingueSottotitolo) {
		this.elencoLingueSottotitolo = elencoLingueSottotitolo;
	}


	public boolean isBonus() {
		return bonus;
	}


	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	
	public static boolean isFull(String [] arr) {
		int cont = 0;
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != null) {
				++cont;
			}			
		}		
		if(cont == arr.length) {
			return true;
		}
		return false;
	}
	
	public boolean aggiungiLinguaAudio(String s) {
		if(isFull(this.elencoLingueAudio)) {
			return false;
		}else {
			for(int i = 0; i < this.elencoLingueAudio.length; ++i) {			
				if(this.elencoLingueAudio[i] == null) {
					this.elencoLingueAudio[i] = s;
					break;
				}					
			}	
			return true;
		}
	}
	
	public boolean aggiungiLinguaSottotitolo(String s) {
		if(isFull(this.elencoLingueSottotitolo)) {
			return false;
		}else {
			for(int i = 0; i < this.elencoLingueSottotitolo.length; ++i) {			
				if(this.elencoLingueSottotitolo[i] == null) {
					this.elencoLingueSottotitolo[i] = s;
					break;
				}					
			}	
			return true;
		}
	}

	
	@Override
	public String toString() {
		String s =  "FilmDvd: " + super.toString();
		for(int i= 0; i < this.elencoLingueAudio.length; ++i ) {
			s += "\n elencoLingueAudio= " + this.elencoLingueAudio[i];
		}
		for(int i= 0; i < this.elencoLingueSottotitolo.length; ++i ) {
			s += "\n elencoLingueSottotitolo= " + this.elencoLingueSottotitolo[i];
		}		
		s += "\n bonus= " + this.bonus;
		
		return s;
	}

	public boolean eq(Film f){
		if(this.getTitolo().equals(f.getTitolo()) && this.getNomeRegista().equals(f.getNomeRegista()) && this.getAnno() == f.getAnno()) {
			return true;
		}
		
		return false;
	}

}
