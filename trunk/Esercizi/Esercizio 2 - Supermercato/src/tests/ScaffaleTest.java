package tests;

import tracciabilità_prodotti.ProdottoDelSupermercato;
import tracciabilità_prodotti.Scaffale;

public class ScaffaleTest {

	public static void main(String[] args) {

		ProdottoDelSupermercato prod1 = new ProdottoDelSupermercato("COD1", 53);
		ProdottoDelSupermercato prod2 = new ProdottoDelSupermercato("COD2", -13);
		ProdottoDelSupermercato prod3 = new ProdottoDelSupermercato("COD3", 20);
		ProdottoDelSupermercato prod4 = new ProdottoDelSupermercato("COD4", 60);
		ProdottoDelSupermercato prod5 = new ProdottoDelSupermercato("COD5", 100);
		ProdottoDelSupermercato prod6 = new ProdottoDelSupermercato("COD6", 40);

		// Scaffale scaff0 = new Scaffale(5);

		// 1)
		Scaffale scaff1 = new Scaffale(2, prod1, prod2, prod3);
		// Dà errore perché lo scaffale può contenere 2 prodotti e provo a
		// metterne 3. Crea ugualmente uno scaffale vuoto
		System.out.println("NULL == " + scaff1.getProdotto(0).getCod());

		// 2)
		// Scaffale scaff1 = new Scaffale()
		scaff1.setProdotto(0, prod1);
		System.out.println("COD1 "
				+ prod1.getGiacenza()
				+ " == "
				+ scaff1.getProdotto(scaff1.numProdottoDaCodice("COD1"))
						.getCod()
				+ " "
				+ scaff1.getProdotto(scaff1.numProdottoDaCodice("COD1"))
						.getGiacenza());

		// 3)
		scaff1.cambiaGiacenza(0, 47);
		System.out.println("100 == " + scaff1.getProdotto(0).getGiacenza());

		// 4)
		Scaffale scaff2 = new Scaffale(6, prod1, prod4, prod5, prod6);
		scaff2.cambiaGiacenza(1, -20);
		System.out.println("40 == " + scaff2.getProdotto(1).getGiacenza());
		int cambiamento = scaff2.cambiaGiacenza(3, -50);
		System.out.println("0 == " + scaff2.getProdotto(3).getGiacenza()
				+ "\t cambiamento effettivo a fronte di ritiro di 50: "
				+ cambiamento);

	}

}
