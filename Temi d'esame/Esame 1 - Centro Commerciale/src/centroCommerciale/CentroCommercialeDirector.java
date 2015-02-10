package centroCommerciale;

import java.util.ArrayList;
import java.util.HashMap;

public class CentroCommercialeDirector {
	
	private HashMap<AttivitaCommerciale, ArrayList<Locale>> mapAttivitaLocali = new HashMap<AttivitaCommerciale, ArrayList<Locale>>();
	
	public void addAttivita(AttivitaCommerciale attivitaCommerciale, Locale... locali) {
		ArrayList<Locale> arrayListLocali = new ArrayList<Locale>();
		for (int i = 0; i < locali.length; i++) {
			arrayListLocali.add(locali[i]);
		}
		this.mapAttivitaLocali.put(attivitaCommerciale, arrayListLocali);
	}
	
	public void addLocaliAdAttivita(AttivitaCommerciale attivitaCommerciale, Locale... locali) {
		for (int i = 0; i < locali.length; i++) {
			mapAttivitaLocali.get(attivitaCommerciale).add(locali[i]);
		}
	}
	
	public void calcolaGuadagniTOT() {
		// TODO Auto-generated method stub
	}

}
