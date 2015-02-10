package centroCommerciale;

public class Servizio extends Attivita {

	public Servizio(String nomeAttivita, float costoFisso, Locale[] locali) {
		super(nomeAttivita, costoFisso, locali);
	}

	@Override
	public float costo(float ricavato) {
		return getCostoFisso()+getCostoMetratura();
	}

}
