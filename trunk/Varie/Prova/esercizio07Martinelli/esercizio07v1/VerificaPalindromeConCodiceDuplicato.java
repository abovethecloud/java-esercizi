package esercizio07v1;

public class VerificaPalindromeConCodiceDuplicato {
	
	
	public int conteggio(String[] parole){
		
		int somma=0;
		for (int i = 0; i < parole.length; i++) {
			
			char[] array=parole[i].toCharArray();
			boolean palindroma=true;
			for (int j = 0; j < array.length; j++) {
				if(array[j]!=array[array.length-j-1]){
					palindroma=false;
				}
			}
			if(palindroma)
				somma++;
			
		}
		
		return somma;
	}
}
