package esercizio0701v1;

public class VerificaPalindromaV1 {
	
	public int conteggio(String... strings) {
		int somma = 0;
		for (int i = 0; i < strings.length; i++) {
			if (palindroma(strings[i]))
				somma+=1;
		}
		return somma;
	}

	public boolean palindroma(String s) {

		if (s.length() < 2)
			return true;
		else {
			if (s.equalsIgnoreCase(reverse(s)))
				return true;
			else
				return false;
		}
	}

	public String reverse(String source) {
		
		StringBuilder dest = new StringBuilder(source.length());
		
		for (int i = 0; i < source.length(); i++) {
			dest.append(source.charAt((source.length() - i) - 1));
		}

		return dest.toString();
	}

}
