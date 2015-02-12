package campoMinato.model;

/**
 * Interfaccia del Buildere/Factory Method
 * 
 * @author claudio
 *
 */
public interface ICampoBuilder {

	/**
	 * Questo metodo restituisce una matrice di caselle secondo una particolare
	 * implementazione
	 * 
	 * @param dim
	 *            Dimensione della matrice quadrata
	 * @return Un matrice di caselle
	 */
	public abstract Casella[][] generaCampo(int dim, int num_mine);

	/**
	 * Crea una casella data la sua posizione (in termini di indici nella
	 * matrice di caselle)
	 * 
	 * @param colonna
	 *            Numero di colonna
	 * @param riga
	 *            Numero di riga
	 * @return Una casella collocata in un certo punto
	 */
	public abstract Casella createCasella(int colonna, int riga);
}
