package centroCommerciale;

public class AttivitaCommerciale extends Attivita {

	public AttivitaCommerciale(String nomeAttivita, float costoFisso,
			Locale[] locali) {
		super(nomeAttivita, costoFisso, locali);
	}

	@Override
	public float costo(float ricavato) {
		return getCostoFisso()+getCostoMetratura()+0.6f*ricavato;
	}

}
