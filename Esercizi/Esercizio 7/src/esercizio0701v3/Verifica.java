package esercizio0701v3;

public class Verifica{
	
	private IVerifica verifica;

	public Verifica(IVerifica verifica) {
		super();
		this.verifica = verifica;
	}
	
	public void setVerifica(IVerifica verifica) {
		this.verifica = verifica;
	}

	public IVerifica getVerifica() {
		return this.verifica;
	}

	public int conteggio(String... strings) {
		int somma = 0;
		for (int i = 0; i < strings.length; i++) {
			if (verifica.verifica(strings[i]))
				somma+=1;
		}
		return somma;
	}

}