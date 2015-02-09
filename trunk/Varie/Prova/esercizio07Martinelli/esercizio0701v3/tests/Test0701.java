package esercizio0701v3.tests;

import esercizio0701v3.VerificaCaratteriStranieri;
import esercizio0701v3.Verifica;
import esercizio0701v3.VerificaPalindrome;

public class Test0701 {

	public static void main(String[] args) {
		
		test0001();
		
		test0002();
	}

	private static void test0002() {
		String[] parole2={"Jeep", "Web", "Spoiler", "Mouse", "Hotel", "cane"};

		Verifica verifica2=new Verifica(new VerificaCaratteriStranieri());
		
		System.out.println("Conteggio Caratteri Stranieri = "+verifica2.conteggio(parole2));
	}

	private static void test0001() {
		String[] parole1={"otto","osso","ada", "casa", "cosa", "cane"};
		
		Verifica verifica1=new Verifica(new VerificaPalindrome());
		
		System.out.println("Conteggio Palindrome = "+verifica1.conteggio(parole1));
	}
}
