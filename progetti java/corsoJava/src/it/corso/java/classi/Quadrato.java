package it.corso.java.classi;

public class Quadrato {
	public static final int NUMERO_LATI =4;
	private int lato;	

	public Quadrato(int lato) {
		setLato(lato); 
	}
	
	public int getLato() {
		return this.lato;
	}

	public void setLato(int lato) {
		if(lato > 0) {
			this.lato = lato;
		}else {
			System.out.println("inserisci lato corretto");
		}
		
	}
	
	public int perimetro() {
		return (lato * NUMERO_LATI);

	}
	
	public int area() {
		return (lato * lato);
	}
}
