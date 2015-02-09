package esercizio0701v3;

/**
 * Conta le parole che soddisfano una certa proprietà
 * @author Alessandro
 */
public class Verifica {
	
	private IVerifica verifica;

	public Verifica(IVerifica verifica) {
		super();
		this.verifica = verifica;
	}

	public int conteggio(String[] parole){
		
		int somma=0;
		for (int i = 0; i < parole.length; i++) {
			if(verifica.verifica(parole[i]))//WATCH HERE!!!!!
				somma++;
			
		}
		
		return somma;
	}
}
