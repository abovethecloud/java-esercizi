package centroCommerciale;

import java.util.ArrayList;

public abstract class Attivita {
	
	// Nome dell'attivita'
	private String nomeAttivita;
	
	//Parametri per il calcolo dei costi fissi dovuti alla metratura
	private static final float SOGLIA_METRATURA=140.0f;
	private static final float COSTO_METRATURA=8.0f;
	private static final float COSTO_METRATURA_RIDOTTO=7.0f;
	
	// Locali che appartengono a questa attivita'
	private ArrayList<Locale> locali = new ArrayList<Locale>();

	// Parametri di metratura e costo della metratura
	private float metraturaTOT = 0f;
	private float costoMetratura = 0f;
	
	// Parametro specifico di questa attività
	private float costoFisso;
	
	// Costruttore
	public Attivita(String nomeAttivita, float costoFisso, Locale... locali) {
		super();
		this.nomeAttivita = nomeAttivita;
		this.costoFisso = costoFisso;
		addLocali(locali);
		getCostoMetratura();
		
	}
	
	public String getNomeAttivita() {
		return nomeAttivita;
	}
	
	public void setNomeAttivita(String nomeAttivita) {
		this.nomeAttivita = nomeAttivita;
	}
	
	public void addLocali(Locale... locali) {
		for (int i = 0; i < locali.length; i++) {
			this.locali.add(locali[i]);
			metraturaTOT += this.locali.get(i).getMetraturaLocale();
		}
		getCostoMetratura();
	}
	
	public float getMetraturaTOT() {
		return metraturaTOT;
	}
	
	public float getCostoMetratura() {
		if (this.metraturaTOT > SOGLIA_METRATURA) {
			this.costoMetratura = metraturaTOT * COSTO_METRATURA_RIDOTTO;
		}
		else
			this.costoMetratura = metraturaTOT * COSTO_METRATURA;
		
		return this.costoMetratura;
	}
	
	public float getCostoFisso() {
		return costoFisso;
	}
	
	public void setCostoFisso(float costoFisso) {
		this.costoFisso = costoFisso;
	}

	public ArrayList<Locale> getLocali() {
		return locali;
	}
	
	public abstract float costo(float ricavato);

}
