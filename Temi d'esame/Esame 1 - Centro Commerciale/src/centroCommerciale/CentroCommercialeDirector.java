package centroCommerciale;

import java.util.ArrayList;
import java.util.HashMap;

public class CentroCommercialeDirector {

	private HashMap<Attivita, Float> mapAttivitaRicavi = new HashMap<Attivita, Float>();

	public void addAttivitaERicavo(Attivita attivita, float ricavo) {
		mapAttivitaRicavi.put(attivita, ricavo);
	}

	public void calcolaGuadagniTOT() {
		// TODO
	}

}
