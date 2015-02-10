package centroCommerciale;

public class Locale {
	
	private int identificativoLocale;
	private int metraturaLocale;
	
	public Locale(int identificativo, int metratura) {
		this.identificativoLocale = identificativo;
		this.metraturaLocale = metratura;
	}
	
	public int getIdentificativoLocale() {
		return identificativoLocale;
	}

	public int getMetraturaLocale() {
		return metraturaLocale;
	}
	
	public void setMetraturaLocale(int metraturaLocale) {
		this.metraturaLocale = metraturaLocale;
	}

}
