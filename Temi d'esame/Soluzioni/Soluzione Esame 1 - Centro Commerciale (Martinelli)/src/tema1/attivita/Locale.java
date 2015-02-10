package tema1.attivita;

/**
 * Una semplice struttura dati contenente la metratura di un locale.
 * 
 * @author Alessandro Martinelli
 */
public class Locale {

	private int metratura;

	public Locale(int metratura) {
		super();
		this.metratura = metratura;
	}

	public int getMetratura() {
		return metratura;
	}

	public void setMetratura(int metratura) {
		this.metratura = metratura;
	}
}
