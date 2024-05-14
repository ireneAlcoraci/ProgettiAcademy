package it.corso.contoBanca;

public class MainContoBanca {

	public static void main(String[] args) {
		ContoBanca conto = new ContoBanca(234, 0);
		
		System.out.println(conto.versamento(1000));
		System.out.println(conto.prelievo(500));
		System.out.println(conto.prelievo(400));
		System.out.println(conto.toString());

	}

}
