package it.corso.contoBanca;

public class ContoBanca {
	private int id;
	private double saldo;
	
	public ContoBanca(double saldo) {
		setSaldo(saldo);
	}
	
	public ContoBanca(int id, double saldo) {
		this(saldo);
		setId(id);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean versamento(double valore) {
		if(valore > 0) {
			saldo += valore;
			return true;
		}
		return false;
		
	}
	
	public boolean prelievo(double valore) {
		if(valore > 0 && saldo >= valore) {
			saldo -= valore;
			return true;
		}else {
			System.out.println("impossibile effettuare il prelievo. Saldo non sufficiente");
			return false;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "id nel conto = " + this.id + "\n" + "saldo nel conto = $" + this.saldo;
	}

	
}
