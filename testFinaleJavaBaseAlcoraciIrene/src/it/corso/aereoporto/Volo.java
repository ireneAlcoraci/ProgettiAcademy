package it.corso.aereoporto;

public class Volo {
	private String sigla;
	private Aereoporto aereoportoPartenza;
	private Aereoporto aereoportoDestinazione;
	private String aeromobile;
	private Passegero [] listaPassegeri;
	private int cont = 0;

	public Volo(String sigla, Aereoporto aereoportoPartenza, Aereoporto aereoportoDestinazione) {
		setSigla(sigla);
		setAereoportoPartenza(aereoportoPartenza);
		setAereoportoDestinazione(aereoportoDestinazione);
	}

	
	public Volo(String sigla, Aereoporto aereoportoPartenza, Aereoporto aereoportoDestinazione, String aeromobile, int dimMassima) {
		this(sigla, aereoportoPartenza, aereoportoDestinazione);
		setAeromobile(aeromobile);
		listaPassegeri = new Passegero[dimMassima];
	}


	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Aereoporto getAereoportoPartenza() {
		return aereoportoPartenza;
	}

	public void setAereoportoPartenza(Aereoporto aereoportoPartenza) {
		this.aereoportoPartenza = aereoportoPartenza;
	}

	public Aereoporto getAereoportoDestinazione() {
		return aereoportoDestinazione;
	}

	public void setAereoportoDestinazione(Aereoporto aereoportoDestinazione) {
		this.aereoportoDestinazione = aereoportoDestinazione;
	}

	public String getAeromobile() {
		return aeromobile;
	}

	public void setAeromobile(String aeromobile) {
		this.aeromobile = aeromobile;
	}

	public Passegero[] getListaPassegeri() {
		return listaPassegeri;
	}

	public void setListaPassegeri(Passegero[] listaPassegeri) {
				this.listaPassegeri = listaPassegeri;
				
	}
	
	public boolean addPassegero(Passegero p) {
		if(this.listaPassegeri.length == cont || !(p.getSiglaVolo().equals(this.sigla))) {
			return false;
		}else {
			for(int i = 0; i < this.listaPassegeri.length; ++i) {			
				if(this.listaPassegeri[i] == null) {
					this.listaPassegeri[i] = p;
					++cont;
					break;
				}
			}	
			return true;
		}
	}


	public String infoVolo() {
		return "Volo " + this.sigla + " " + this.aereoportoPartenza.getCitta() + " " + this.aereoportoPartenza.getNome() + " - "
				+ this.aereoportoDestinazione.getCitta() + " " + this.aereoportoDestinazione.getNome();
	}
	
	
	public String getElencoPassegeri() {
		String elenco = "";
		for(int i = 0; i < this.listaPassegeri.length; ++i) {
			if(listaPassegeri[i] != null) {
				elenco += " Passegero posto " + listaPassegeri[i].getPosto()  + ": " + listaPassegeri[i].getNome() + "\r\n";
			}					
		}
		return elenco;
	}
	
	public String getPostiVegetariani() {
		String elenco = "";
		for(int i = 0; i < this.listaPassegeri.length; ++i) {
			if(listaPassegeri[i] != null && listaPassegeri[i].getPasto().equals("vegetariano")) {
				elenco += " Passegero " + i + ": " + listaPassegeri[i].getPosto() + "\r\n";
			}					
		}
		return elenco;
	}
	

	

}
