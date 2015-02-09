package esercizio07v1.tests;

import esercizio07v1.VerificaCaratteriStranieriConCodiceDuplicato;
import esercizio07v1.VerificaPalindromeConCodiceDuplicato;

public class Test0701ConCodiceDuplicato {

	public static void main(String[] args) {
		
		test0001();
		
		test0002();
	}

	private static void test0002() {
		String[] parole2={"Jeep", "Web", "Spoiler", "Mouse", "Hotel", "cane"};
		
		VerificaCaratteriStranieriConCodiceDuplicato verifica2=new VerificaCaratteriStranieriConCodiceDuplicato();
		
		System.out.println("Conteggio Caratteri Stranieri = "+verifica2.conteggio(parole2));
	}

	private static void test0001() {
		String[] parole1={"otto","osso","ada", "casa", "cosa", "cane"};
		
		VerificaPalindromeConCodiceDuplicato verifica1=new VerificaPalindromeConCodiceDuplicato();
		
		System.out.println("Conteggio Palindrome = "+verifica1.conteggio(parole1));
	}
}
