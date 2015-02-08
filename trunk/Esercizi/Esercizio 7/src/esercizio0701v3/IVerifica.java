package esercizio0701v3;

/**
 * Quest'interfaccia dichiara il metodo di verifica generico, che è differente
 * per ogni tipologia di verifica. Nel nostro caso avremo due diverse
 * implementazioni di verifica: Palindroma e Caratteri Stranieri.
 * 
 * @author claudio
 *
 */
public interface IVerifica {

	/**
	 * Verifica da effettuare sulla stringa passata al metodo
	 * 
	 * @param s
	 *            Stringa su cui effettuare la verifica
	 * @return Il valore booleano true se è verificata la condizione, false
	 *         altrimenti
	 */
	public abstract boolean verifica(String s);

}