package esercizio0701v3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import esercizio0701v3.Verifica;
import esercizio0701v3.VerificaCaratteriStranieri;
import esercizio0701v3.VerificaPalindroma;

public class Jtest0701v3 {

	@Test
	public void test0001() {
		Verifica verificaP = new Verifica(new VerificaPalindroma());
		String parole1[] = {"otto","osso","ada","casa","cosa","cane"};
		
		int contP = verificaP.conteggio(parole1);
		System.out.println(contP+"\n");
		
		// FALLIMENTO QUANDO:
		if (contP != 3)
			fail("Not functioning");
	}
	
	@Test
	public void test0002() {
		Verifica verificaCS = new Verifica(new VerificaCaratteriStranieri());
		String parole2[] = {"Jeep", "Web","Spoiler","Mouse","Hotel","Cane"};
		
		int contCS = verificaCS.conteggio(parole2);
		System.out.println(contCS);
		
		// FALLIMENTO QUANDO:
		if (contCS != 2)
			fail("Not functioning");
	}
	
	public static void main(String[] args) {
		Jtest0701v3 tester = new Jtest0701v3();
		tester.test0001();
		tester.test0002();
	}

}
