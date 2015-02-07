package esercizio0701v2.tests;

import esercizio0701v2.VerificaCaratteriStranieriConSuperClasse;
import esercizio0701v2.VerificaPalindromaConSuperClasse;

public class TestVerificheV2 {
	
	public static void main(String[] args) {
		
		test0001();
		
		test0002();
		
	}

	private static void test0001() {
		VerificaPalindromaConSuperClasse verificaP = new VerificaPalindromaConSuperClasse();
		String parole1[] = {"otto","osso","ada","casa","cosa","cane"};
		
		for (int i = 0; i < parole1.length; i++) {
			boolean verifica1 = verificaP.verifica(parole1[i]);
			System.out.println(parole1[i]+" == "+verificaP.reverse(parole1[i])+"?\t"+verifica1);
		}
		
		int contP = verificaP.conteggio(parole1);
		System.out.println(contP+"\n");
	}
	
	private static void test0002() {
		VerificaCaratteriStranieriConSuperClasse verificaCS = new VerificaCaratteriStranieriConSuperClasse();
		String parole2[] = {"Jeep", "Web","Spoiler","Mouse","Hotel","Cane"};
		
		for (int i = 0; i < parole2.length; i++) {
			boolean verifica2 = verificaCS.verifica(parole2[i]);
			System.out.println("\""+parole2[i]+"\""+" contiene caratteri stranieri?\t"+verifica2);	
		}
		
		int contCS = verificaCS.conteggio(parole2);
		System.out.println(contCS);
	}
}
