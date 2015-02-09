package esercizio0701v2.tests;

import esercizio07v1.VerificaCaratteriStranieriConCodiceDuplicato;
import esercizio07v1.VerificaPalindromeConCodiceDuplicato;
import esercizio0701v2.VerificaCaratteriStranieriConClasseAstratta;
import esercizio0701v2.VerificaPalindromeConClasseAstratta;

public class Test0701ConClassiAstratte {

	public static void main(String[] args) {
		
		test0001();
		
		test0002();
	}

	private static void test0002() {
		String[] parole2={"Jeep", "Web", "Spoiler", "Mouse", "Hotel", "cane"};
		
		VerificaCaratteriStranieriConClasseAstratta verifica2=new VerificaCaratteriStranieriConClasseAstratta();
		
		System.out.println("Conteggio Caratteri Stranieri = "+verifica2.conteggio(parole2));
	}

	private static void test0001() {
		String[] parole1={"otto","osso","ada", "casa", "cosa", "cane"};
		
		VerificaPalindromeConClasseAstratta verifica1=new VerificaPalindromeConClasseAstratta();
		
		System.out.println("Conteggio Palindrome = "+verifica1.conteggio(parole1));
	}
}
