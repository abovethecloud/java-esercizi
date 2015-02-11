package dizionario.tests;

import dizionario.model.ConvertiStringa;

public class ConvertiStringaTest {
	
	public static void main(String[] args) {
		
		ConvertiStringa convertiStringa = new ConvertiStringa();
		
		convertiStringa.dividiStringa("Cacca : Shit L'ammerda è beeeellla");
		
		System.out.println(convertiStringa.getParola() +" : "+ convertiStringa.getDescrizione());
	}

}
