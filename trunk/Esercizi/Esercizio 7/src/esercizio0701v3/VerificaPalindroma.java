package esercizio0701v3;

/**
 * Verifica concreta se la parola è palindroma
 * 
 * @author claudio
 *
 */
public class VerificaPalindroma implements IVerifica {

	@Override
	public boolean verifica(String s) {

		if (s.length() < 2)
			return true;
		else {
			if (s.equalsIgnoreCase(reverse(s)))
				return true;
			else
				return false;
		}
	}

	/*
	 * Metodo che inverte una stringa. la verifica avrebbe potuto essere più
	 * semplice con una verifica carattere per carattere, forse..
	 */
	public String reverse(String source) {

		StringBuilder dest = new StringBuilder(source.length());

		for (int i = 0; i < source.length(); i++) {
			dest.append(source.charAt((source.length() - i) - 1));
		}

		return dest.toString();
	}

}
