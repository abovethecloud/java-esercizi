package esercizio0701v3;

/**
 * Verifica concreta sui caratteri stranieri.
 * 
 * @author claudio
 *
 */
public class VerificaCaratteriStranieri implements IVerifica {

	public VerificaCaratteriStranieri() {
		super();
	}

	/* Per ogni carattere della stringa verifica con uno switch */
	public boolean verifica(String s) {

		// Prima di tutto elimino le maiuscole
		String stringaNoMaiuscole = s.toLowerCase();

		for (int i = 0; i < stringaNoMaiuscole.length(); i++) {
			switch (stringaNoMaiuscole.charAt(i)) {
			case 'j':
			case 'k':
			case 'w':
			case 'x':
			case 'y':
				return true;

			default:
				break;
			}

		}

		return false;
	}
}
