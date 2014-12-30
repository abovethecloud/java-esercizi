package tests;

import tracciabilità_prodotti.ProdottoDelSupermercato;
import tracciabilità_prodotti.Supermercato;

public class SupermercatoTest {
	
	public static void main(String[] args) {
	
		ProdottoDelSupermercato prod1 = new ProdottoDelSupermercato("COD1", 53);
		ProdottoDelSupermercato prod2 = new ProdottoDelSupermercato("COD2", -13);
		ProdottoDelSupermercato prod3 = new ProdottoDelSupermercato("COD1", 20);
		ProdottoDelSupermercato prod4 = new ProdottoDelSupermercato("COD1", 60);
		ProdottoDelSupermercato prod5 = new ProdottoDelSupermercato("COD5", 100);
		ProdottoDelSupermercato prod6 = new ProdottoDelSupermercato("COD6", 40);
		
		Supermercato sup1 = new Supermercato(-1, 0);
		Supermercato sup2 = new Supermercato(5, 10);
		Supermercato sup3 = new Supermercato(2, 0);
		Supermercato sup4 = new Supermercato(10, 100);
		
		// 1)
		sup1.setProdotto(0, 0, new ProdottoDelSupermercato("COD1", 100));
		int tot1 = sup1.contaGiacenzeSup("COD1");
		System.out.println("100 == "+tot1);
		
		// 2)
		sup2.setProdotto(0, 0, prod1);
		sup2.setProdotto(0, 1, prod3);
		
		int tot2 = sup2.contaGiacenzeSup("COD1");
		System.out.println("73 == "+tot2);
		
		// 3)
		sup3.setProdotto(0, 0, prod1);
		sup3.setProdotto(0, 1, prod3);
		sup3.setProdotto(1, 0, prod2);
		sup3.setProdotto(1, 1, prod4);
		
		int tot3 = sup3.contaGiacenzeSup("COD1");
		System.out.println("53 == "+tot3);
		
		// 4)
		sup4.setProdotto(0, 0, prod1);
		sup4.setProdotto(0, 1, prod3);
		sup4.setProdotto(1, 0, prod2);
		sup4.setProdotto(1, 1, prod4);
		
		int tot4 = sup4.contaGiacenzeSup("COD1");
		System.out.println("133 == "+tot4);
		
		
		
		
		
		
	}

}
