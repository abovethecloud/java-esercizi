package tests.people;

import people.Persona;
import time.Data;

public class PersonaTest {
	
	public static void main(String[] args) {
		
		Data nascita_al = new Data(16, 8, 1951);
		Data nascita_dn = new Data(24, 1, 1954);
		Data nascita_an = new Data(01, 8, 1995);
		Data nascita_cl = new Data(01, 10, 1993);


		Data attuale = new Data(1, 1, 2000);
		// 	Data attuale = new Data(30, 7, 2015);	// Imprecisione sugli anni di Angelica

		
		Persona persona_al = new Persona("Aldo", nascita_al);
		Persona persona_dn = new Persona("Diana", nascita_dn);
		Persona persona_an = new Persona("Angelica", nascita_an);
		Persona persona_cl = new Persona("Claudio", nascita_cl);


		System.out.println(persona_al.getNome()+":\t?? == "+persona_al.getEta(attuale));
		System.out.println(persona_dn.getNome()+":\t?? == "+persona_dn.getEta(attuale));
		System.out.println(persona_an.getNome()+":\t?? == "+persona_an.getEta(attuale));
		System.out.println(persona_cl.getNome()+":\t?? == "+persona_cl.getEta(attuale));		



		
		
		
		
	}

}
