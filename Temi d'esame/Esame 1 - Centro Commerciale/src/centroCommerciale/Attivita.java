package centroCommerciale;

import java.util.ArrayList;

public class Attivita {
	
	private int metraturaTOT = 0;
	private ArrayList<Locale> locali = new ArrayList<Locale>();
	
	
	public Attivita(Locale... locali) {
		super();
		addLocali(locali);
		
	}

	public int getMetraturaTOT() {
		return metraturaTOT;
	}

	public ArrayList<Locale> getLocali() {
		return locali;
	}
	
	public void addLocali(Locale... locali) {
		for (int i = 0; i < locali.length; i++) {
			this.locali.add(locali[i]);
			metraturaTOT+=this.locali.get(i).getMetraturaLocale();
		}
	}
	

}
