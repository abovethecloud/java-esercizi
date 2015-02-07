package esercizio0701v2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import esercizio0701v2.VerificaCaratteriStranieriConSuperClasse;
import esercizio0701v2.VerificaPalindromaConSuperClasse;

public class Jtest0701v2 {

	@Test
	public void test0001() {
		VerificaPalindromaConSuperClasse verificaP = new VerificaPalindromaConSuperClasse();
		String parole1[] = {"otto","osso","ada","casa","cosa","cane"};
		
		for (int i = 0; i < parole1.length; i++) {
			boolean verifica1 = verificaP.verifica(parole1[i]);
			System.out.println(parole1[i]+" == "+verificaP.reverse(parole1[i])+"?\t"+verifica1);
		}
		
		int contP = verificaP.conteggio(parole1);
		System.out.println(contP+"\n");
		
		// FALLIMENTO QUANDO:
		if (contP != 3)
			fail("Not functioning");
	}
	
	@Test
	public void test0002() {
		VerificaCaratteriStranieriConSuperClasse verificaCS = new VerificaCaratteriStranieriConSuperClasse();
		String parole2[] = {"Jeep", "Web","Spoiler","Mouse","Hotel","Cane"};
		
		for (int i = 0; i < parole2.length; i++) {
			boolean verifica2 = verificaCS.verifica(parole2[i]);
			System.out.println("\""+parole2[i]+"\""+" contiene caratteri stranieri?\t"+verifica2);	
		}
		
		int contCS = verificaCS.conteggio(parole2);
		System.out.println(contCS);
		
		// FALLIMENTO QUANDO:
		if (contCS != 2)
			fail("Not functioning");
	}
	
	public static void main(String[] args) {
		Jtest0701v2 tester = new Jtest0701v2();
		tester.test0001();
		tester.test0002();
	}

}
