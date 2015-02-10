package tema1.attivita;

/**
 * Un Servizio (Parrucchiere, estetista)
 * 
 * @author Alessandro Martinelli
 */
public class Servizio extends Attivita{

	/*NOTA: non ш necessario, anzi ш potenzialmente pericoloso ed errato,
	 mettere un commento javadoc su un metodo che fa l'Override di una funzione di 
	cui ш giра stato fatto il javadoc nella classe Padre*/
	public float costo(float ricavato) {
		//costo non dipendente dal ricavato
		return costoMetratura()+getCostoFisso();
	}
}
