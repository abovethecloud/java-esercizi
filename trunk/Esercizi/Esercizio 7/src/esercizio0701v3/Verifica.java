package esercizio0701v3;

/**
 * Generica classe di Verifica, funge da classe padre per le classi più
 * specifiche di verifica. Può essere utilizzata a Run-Time per cambiare il tipo
 * di verifica (modificando la verifica contenuta all'interno con un
 * setVerifica)
 * 
 * @author claudio
 *
 */
public class Verifica {

	private IVerifica verifica;

	public Verifica(IVerifica verifica) {
		super();
		this.verifica = verifica;
	}

	public void setVerifica(IVerifica verifica) {
		this.verifica = verifica;
	}

	/**
	 * Metodo di get che permette di accedere ai metodi della verifica concreta
	 * 
	 * @return
	 */
	public IVerifica getVerifica() {
		return this.verifica;
	}

	/**
	 * Metodo che conta il numero di volte in cui si verifica la proprietà su un
	 * vettore contenente un certo numero di stringhe
	 * 
	 * @param strings
	 *            Vettore di stringhe dichiarato con la notazione *String...*
	 *            (dunque può acnche essere una singola stringa) su cui
	 *            verificare il numero di stringhe per cui vale la proprietà
	 *            verificata
	 * @return Il numero di stringhe per cui si verifica valida la proprietà.
	 */
	public int conteggio(String... strings) {
		int somma = 0;
		for (int i = 0; i < strings.length; i++) {
			if (verifica.verifica(strings[i]))
				somma += 1;
		}
		return somma;
	}

}