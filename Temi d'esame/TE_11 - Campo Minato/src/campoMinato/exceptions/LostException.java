package campoMinato.exceptions;

/**
 * Questa classe serve a creare l'eccezione (da gestirsi con un DP Chain of
 * Responsibilities) per la sconfitta
 * 
 * @author claudio
 *
 */
@SuppressWarnings("serial")
public class LostException extends Exception {

	public LostException(String message) {
		super(message);
	}

}
