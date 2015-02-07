package esercizio0701v2;

public class VerificaPalindromaConSuperClasse extends VerificaSuperClasse {
	
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

	public String reverse(String source) {
		
		StringBuilder dest = new StringBuilder(source.length());
		
		for (int i = 0; i < source.length(); i++) {
			dest.append(source.charAt((source.length() - i) - 1));
		}

		return dest.toString();
	}

}
