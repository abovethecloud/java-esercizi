package tema1.attivita;

/**
 * Una attività  Commerciale (Negozio, Bar)
 * 
 * @author Alessandro Martinelli
 */
public class AttivitaCommerciale extends Attivita{

	/*NOTA: non è necessario, anzi è potenzialmente pericoloso ed errato,
	 mettere un commento javadoc su un metodo che fa l'Override di una funzione di 
	cui é già  stato fatto il javadoc nella classe Padre*/
	public float costo(float ricavato) {
		//il costo dipende anche dal ricavato
		return getCostoFisso()+costoMetratura()+0.6f*ricavato;
	}
}
