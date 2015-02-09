package esercizio0701v3;

public class VerificaPalindrome implements IVerifica{
	
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
