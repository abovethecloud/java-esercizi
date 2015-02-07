package esercizio0701v1;

import java.util.ArrayList;
import java.util.Collections;

public class VerificaCaratteriStranieriV1 {

	private ArrayList<Character> alfabetoStraniero = new ArrayList<Character>(5);

	public VerificaCaratteriStranieriV1() {
		super();
		
		Collections.addAll(alfabetoStraniero,
				(Character) "j".charAt(0),
				(Character) "k".charAt(0),
				(Character) "w".charAt(0),
				(Character) "x".charAt(0),
				(Character) "y".charAt(0));
	}

	public int conteggio(String... strings) {

		int somma = 0;

		for (int i = 0; i < strings.length; i++) {
			if (caratteriStranieri(strings[i]))
				somma += 1;
		}

		return somma;
	}

	public boolean caratteriStranieri(String s) {

		// Prima di tutto elimino le maiuscole
		String stringaNoMaiuscole = s.toLowerCase();
		
		for (int i = 0; i < stringaNoMaiuscole.length(); i++) {
			for (Character character : alfabetoStraniero) {
				if (stringaNoMaiuscole.charAt(i) == character)
					return true;
			}
		}

		return false;
	}
}
