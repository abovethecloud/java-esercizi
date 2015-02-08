package esercizio0702v3.tests;

import static org.junit.Assert.fail;

import org.junit.Test;

import esercizio0702v1.ListShuffle;
import esercizio0702v1.ListZA;
import esercizio0702v3.ListAZ;
import esercizio0702v3.ListSuperClass;
import esercizio0702v3.OrderAZ;
import esercizio0702v3.OrderZAComparator;

public class Test0001 {
	ListAZ listAZ = new ListAZ();
	ListZA listZA = new ListZA();
	ListShuffle listShuffle = new ListShuffle();
	ListSuperClass list = new ListSuperClass(new OrderAZ());

	public static void main(String[] args) {

		Test0001 test = new Test0001();
		test.test0001();
		System.out.println("\n");

		test.test0002();
		System.out.println("\n");

		test.test0003();
		System.out.println("\n");
		
		test.test0004();
	}

	@Test
	public void test0001() {
		listAZ.addStrings("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");
		
		// Conta le 'a'
		int num = listAZ.countChar('a');
		System.out.println(num);
		if (num != 5)
			fail("numero di caratteri errato");
		
		// Verifichiamo l'ordine Alfabetico AZ
		for (String string : listAZ.order()) {
			System.out.println(string);
		}		
	}

	@Test
	public void test0002() {
		listZA.addStrings("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");
		
		// Conta le 'a'
		int num = listZA.countChar('a');
		System.out.println(num);
		if (num != 5)
			fail("numero di caratteri errato");
		
		// Verifichiamo l'ordine Alfabetico ZA
		for (String string : listZA.order()) {
			System.out.println(string);
		}
		
	}
	@Test
	public void test0003() {
		listShuffle.addStrings("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");
		
		// Conta le 'a'
		int num = listShuffle.countChar('a');
		System.out.println(num);
		if (num != 5)
			fail("numero di caratteri errato");
		
		// Verifichiamo l'ordine casuale
		for (String string : listShuffle.order()) {
			System.out.println(string);
		}
		
	}
	
	@Test
	public void test0004(){
		list.addStrings("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");

		list.setOrderType(new OrderZAComparator());
		for (String string : list.order()) {
			System.out.println(string);
		}
	}

}
