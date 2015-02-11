package dizionario.model;

import java.util.HashMap;

public class ConvertiStringa {
	
	private String parola;
	private String descrizione;
	
	public void dividiStringa(String string) {
		
		String stringVett[] = string.split(" : ");
		this.parola = stringVett[0];
		this.descrizione = stringVett[1];
	} 
	
	public String getParola() {
		return parola;
	}

	public String getDescrizione() {
		return descrizione;
	}

}
