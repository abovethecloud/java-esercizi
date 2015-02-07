package esercizio0701v1.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import esercizio0701v1.VerificaCaratteriStranieriV1;
import esercizio0701v1.VerificaPalindromaV1;

public class Jtest0701v1 {

	@Test
	public void test0001() {
		VerificaPalindromaV1 verificaP1 = new VerificaPalindromaV1();
		String parole1[] = {"otto","osso","ada","casa","cosa","cane"};
		
		for (int i = 0; i < parole1.length; i++) {
			boolean verifica1 = verificaP1.palindroma(parole1[i]);
			System.out.println(parole1[i]+" == "+verificaP1.reverse(parole1[i])+"?\t"+verifica1);
		}
		
		int contP = verificaP1.conteggio(parole1);
		System.out.println(contP+"\n");
		
		// FALLIMENTO QUANDO:
		if (contP != 3)
			fail("Not functioning");
	}
	
	@Test
	public void test0002() {
		VerificaCaratteriStranieriV1 verificaCS1 = new VerificaCaratteriStranieriV1();
		String parole2[] = {"Jeep", "Web","Spoiler","Mouse","Hotel","Cane"};
		
		for (int i = 0; i < parole2.length; i++) {
			boolean verifica2 = verificaCS1.caratteriStranieri(parole2[i]);
			System.out.println("\""+parole2[i]+"\""+" contiene caratteri stranieri?\t"+verifica2);	
		}
		
		int contCS = verificaCS1.conteggio(parole2);
		System.out.println(contCS);
		
		// FALLIMENTO QUANDO:
		if (contCS != 2)
			fail("Not functioning");
	}
	
	public static void main(String[] args) {
		Jtest0701v1 tester = new Jtest0701v1();
		tester.test0001();
		tester.test0002();
	}

}
