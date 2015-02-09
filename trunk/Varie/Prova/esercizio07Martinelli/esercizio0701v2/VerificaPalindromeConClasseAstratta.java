package esercizio0701v2;

public class VerificaPalindromeConClasseAstratta extends AbstractVerifica{
	
	@Override
	public boolean verifica(String parola) {
		char[] array=parola.toCharArray();
		for (int j = 0; j < array.length; j++) {
			if(array[j]!=array[array.length-j-1]){
				return false;
			}
		}
		return true;
	}
	
}
