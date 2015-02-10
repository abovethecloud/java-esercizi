package centroCommerciale;

import java.util.ArrayList;

public class AttivitaCommerciale {
	
	public static float NETTO_AL_VENDUTO = 0.4f;
	public static int COSTO_AL_METRO = 8;
	public static int COSTO_AL_METRO_RIDOTTO = 7;
	
	private String nomeAttivita;
	private int metraturaTOT = 0;
	private ArrayList<Locale> locali = new ArrayList<Locale>();
	private int costoAlMetro = 0;
	
	public void setCostoAlMetro() {
		if (this.metraturaTOT > 140)
			this.costoAlMetro = COSTO_AL_METRO_RIDOTTO;
		else
			this.costoAlMetro = COSTO_AL_METRO;
	}
	
	public AttivitaCommerciale(Locale... locali) {
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
		setCostoAlMetro();
	}
	

}
