package it.corso.aereoporto;

public class VoloNonDiretto extends Volo{
	private Aereoporto[] scali;
	private int cont = 0;
	
	public VoloNonDiretto(String sigla, Aereoporto aereoportoPartenza, Aereoporto aereoportoDestinazione) {
		super(sigla, aereoportoPartenza, aereoportoDestinazione);
	}
	
	public VoloNonDiretto(String sigla, Aereoporto aereoportoPartenza, Aereoporto aereoportoDestinazione, String aeromobile, int dimMassima,
			int dimMaxScali) {
		super(sigla, aereoportoPartenza, aereoportoDestinazione, aeromobile,dimMassima);
		scali = new Aereoporto[dimMaxScali];
	}

	public Aereoporto[] getScali() {
		return scali;
	}

	public void setScali(Aereoporto[] scali) {
		this.scali = scali;
	}
	
	public boolean addScalo(Aereoporto a) {
		if(this.scali.length == cont) {
			return false;
		}else {
			for(int i = 0; i < this.scali.length; ++i) {			
				if(this.scali[i] == null) {
					this.scali[i] = a;
					++cont;
					break;
				}					
			}	
			return true;
		}
	}

	public String infoVoloNonDiretto() {
		String info = super.infoVolo() + " via ";		
		for(int i= 0; i < this.scali.length; ++i ) {
			info += this.scali[i].getCitta() + " " + this.scali[i].getNome();
			if(i != this.scali.length - 1) {
				info += " - ";
			}
		}
		return info;
	}
	

}
