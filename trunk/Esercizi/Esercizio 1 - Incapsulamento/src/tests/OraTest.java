package tests;

import time.Ora;

public class OraTest {
	
	public static void main(String[] args) {
		
		Ora ora1 = new Ora(25, 31);
		Ora ora2 = new Ora(12, 20);
		Ora ora3 = new Ora(-5, 62);
		
		System.out.println(ora2.getDiffMinuti(ora3));
		
	}
	
	
	
}
