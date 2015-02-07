package esercizio0701v3;

import java.util.ArrayList;
import java.util.Collections;

public class VerificaCaratteriStranieri implements IVerifica {

	private ArrayList<Character> alfabetoStraniero = new ArrayList<Character>(5);

	public VerificaCaratteriStranieri() {
		super();
		
		Collections.addAll(alfabetoStraniero,
				(Character) "j".charAt(0),
				(Character) "k".charAt(0),
				(Character) "w".charAt(0),
				(Character) "x".charAt(0),
				(Character) "y".charAt(0));
	}


	public boolean verifica(String s) {

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
