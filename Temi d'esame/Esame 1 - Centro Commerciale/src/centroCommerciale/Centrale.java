package centroCommerciale;

import java.util.ArrayList;

public class Centrale {
	
	private ArrayList<Attivita> listaAttivita = new ArrayList<Attivita>();

	public ArrayList<Attivita> getListaAttivita() {
		return listaAttivita;
	}

	public void setListaAttivita(ArrayList<Attivita> listaAttivita) {
		this.listaAttivita = listaAttivita;
	}
	
	private void addAttivita(Attivita... attivita) {
		for (int i = 0; i < attivita.length; i++) {
			listaAttivita.add(attivita[i]);
		}

	}
	
	

}
