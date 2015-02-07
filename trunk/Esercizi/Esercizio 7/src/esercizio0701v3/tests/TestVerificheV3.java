package esercizio0701v3.tests;

import esercizio0701v3.Verifica;
import esercizio0701v3.VerificaCaratteriStranieri;
import esercizio0701v3.VerificaPalindroma;

public class TestVerificheV3 {
	
	public static void main(String[] args) {
		
		test0001();
		
		test0002();
		
	}

	private static void test0001() {
		Verifica verificaP = new Verifica(new VerificaPalindroma());
		String parole1[] = {"otto","osso","ada","casa","cosa","cane"};
		
		for (int i = 0; i < parole1.length; i++) {
			boolean verifica1 = verificaP.getVerifica().verifica(parole1[i]);
			System.out.println(parole1[i]+" == "+(new VerificaPalindroma()).reverse(parole1[i])+"?\t"+verifica1);
		}
		
		int contP = verificaP.conteggio(parole1);
		System.out.println(contP+"\n");
	}
	
	private static void test0002() {
		Verifica verificaCS = new Verifica(new VerificaCaratteriStranieri());
		String parole2[] = {"Jeep", "Web","Spoiler","Mouse","Hotel","Cane"};
		
		for (int i = 0; i < parole2.length; i++) {
			boolean verifica2 = verificaCS.getVerifica().verifica(parole2[i]);
			System.out.println("\""+parole2[i]+"\""+" contiene caratteri stranieri?\t"+verifica2);	
		}
		
		int contCS = verificaCS.conteggio(parole2);
		System.out.println(contCS);
	}
}
