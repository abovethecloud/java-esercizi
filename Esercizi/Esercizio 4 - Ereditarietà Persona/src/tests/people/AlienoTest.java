package tests.people;

import people.Alieno;
import people.Persona;
import time.Data;

public class AlienoTest {
	
	public static void main(String[] args) {
		
		Data nascita_al = new Data(16, 8, 1951);
		Data nascita_dn = new Data(24, 1, 1954);
		Data nascita_an = new Data(01, 8, 1995);
		Data nascita_cl = new Data(01, 10, 1993);


		Data attuale = new Data(1, 1, 2000);

		
		Persona alieno_al = new Alieno("Aldo", nascita_al);
		Persona alieno_dn = new Alieno("Diana", nascita_dn);
		Persona alieno_an = new Alieno("Angelica", nascita_an);
		Persona alieno_cl = new Alieno("Claudio", nascita_cl);


		System.out.println(alieno_al.getNome()+":\t?? == "+alieno_al.getEta(attuale));
		System.out.println(alieno_dn.getNome()+":\t?? == "+alieno_dn.getEta(attuale));
		System.out.println(alieno_an.getNome()+":\t?? == "+alieno_an.getEta(attuale));
		System.out.println(alieno_cl.getNome()+":\t?? == "+alieno_cl.getEta(attuale));		

	}

}
