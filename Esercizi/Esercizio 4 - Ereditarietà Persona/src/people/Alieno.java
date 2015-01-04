package people;

import time.Data;

public class Alieno extends Persona {

	public Alieno(String nome, Data nascita) {
		super(nome, nascita);
	}
	
	@Override
	public int getEta(Data data) {
		int EtaPersona = super.getEta(data);
		int Ringiovanimento = (int) (EtaPersona/5);
		return (EtaPersona - Ringiovanimento);
	}

	
	
}
