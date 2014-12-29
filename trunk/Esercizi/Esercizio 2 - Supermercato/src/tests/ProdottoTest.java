package tests;

import tracciabilità_prodotti.ProdottoDelSupermercato;

public class ProdottoTest {
	
	public static void main(String[] args) {
		
		ProdottoDelSupermercato prod1 = new ProdottoDelSupermercato("COD1", 53);
		ProdottoDelSupermercato prod2 = new ProdottoDelSupermercato("COD2", -13);
		
		System.out.println(prod1.getCod()+" "+prod1.getVolume());
		System.out.println(prod2.getCod()+" "+prod2.getVolume());

	}

}
