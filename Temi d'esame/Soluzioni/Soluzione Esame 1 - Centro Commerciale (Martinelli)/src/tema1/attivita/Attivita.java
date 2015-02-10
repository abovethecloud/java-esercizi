package tema1.attivita;

import java.util.ArrayList;

/**
 * Una generica attivit‡
 * 
 * @author Alessandro Martinelli
 */
public abstract class Attivita {
	
	//Nome dell'attivit‡
	private String nome;
	
	//Parametri per il calcolo dei costi fissi dovuti alla metratura
	private static final float SOGLIA_METRATURA=140.0f;
	private static final float COSTO_METRATURA_1=8.0f;
	private static final float COSTO_METRATURA_2=7.0f;
	
	//Locali che appartengono a questa attivit√†
	private ArrayList<Locale> locali=new ArrayList<Locale>();
	
	//il costo fisso di questa attivit√†
	private float costoFisso;
	
	/**
	 * Ritorna il costo giornaliero per questa attivit‡ . Il costo,
	 * in taluni casi puÚ dipendere dal ricavato dell'attivit‡† stessa.
	 * 
	 * @param ricavato Il ricavato dell'attivit‡†
	 * @return Il costo sostenuto in giornata dall'attivit‡
	 */
	public abstract float costo(float ricavato);
	
	/**
	 * Aggiunge un locale all'attivit√†
	 * @param locale
	 */
	public void addLocale(Locale locale){
		locali.add(locale);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return la metratura totale di questa attivit√†
	 */
	public float getMetratura(){
		//calcola la somma delle metrature di tutti i locali
		float sum=0;
		for (int i = 0; i < locali.size(); i++) {
			sum+=locali.get(i).getMetratura();
		}
		return sum;
	}
	
	/**
	 * @return recupera il costo fisso dovuto alla metratura
	 */
	public float costoMetratura(){
		float metratura=getMetratura();
		if(metratura>SOGLIA_METRATURA){
			return metratura*COSTO_METRATURA_2;
		}else{
			return metratura*COSTO_METRATURA_1;
		}
	}

	public float getCostoFisso() {
		return costoFisso;
	}

	public void setCostoFisso(float costoFisso) {
		this.costoFisso = costoFisso;
	}	
	
}









