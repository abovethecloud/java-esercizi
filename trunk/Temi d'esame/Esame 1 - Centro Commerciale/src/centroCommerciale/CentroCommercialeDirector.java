package centroCommerciale;

import java.util.HashMap;
import java.util.Set;

public class CentroCommercialeDirector {

	private HashMap<Attivita, Float> mapAttivitaGuadagno = new HashMap<Attivita, Float>();

	public void addGuadagnoAttivita(Attivita attivita, float ricavo) {
		float guadagno = ricavo - attivita.costo(ricavo);
		mapAttivitaGuadagno.put(attivita, guadagno);
	}

	public float calcolaGuadagniTOT() {
		Set<Attivita> set = mapAttivitaGuadagno.keySet();
	
		float guadagnoTOT = 0;
		
		for (Attivita attivita : set) {
			guadagnoTOT += mapAttivitaGuadagno.get(attivita);
		}
		return guadagnoTOT;
	}

}
