package tests;

import time.Ora;

/* Implementare una classe di Test, per verificare il funzionamento di Ora*/
public class OraTest2 {

	public static void main(String[] args) {
		
		/* In particolare, si istanzino 3 oggetti ora, assegnando h d m*/
		Ora ora1=new Ora(8, 30);
		Ora ora2=new Ora(12, 50);
		Ora ora3=new Ora(17, 10);
		
		System.out.println("Minuti tra ora 1 e ora 2 "+ora1.getDiffMinuti(ora2));
		System.out.println("Minuti tra ora 2 e ora 3 "+ora2.getDiffMinuti(ora3));
		System.out.println("Minuti tra ora 3 e ora 1 "+ora3.getDiffMinuti(ora1));
		
	}
}
