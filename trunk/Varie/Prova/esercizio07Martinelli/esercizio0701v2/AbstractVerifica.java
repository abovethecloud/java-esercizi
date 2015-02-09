package esercizio0701v2;

public abstract class AbstractVerifica {
	
	/**
	 * Verifica una specifica parola
	 * @param parola
	 * @return
	 */
	public abstract boolean verifica(String parola);

	public int conteggio(String[] parole){
		
		int somma=0;
		for (int i = 0; i < parole.length; i++) {
			if(verifica(parole[i]))
				somma++;
			
		}
		
		return somma;
	}
}
