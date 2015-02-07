package esercizio0701v2;

public abstract class VerificaSuperClasse {

	public VerificaSuperClasse() {
		super();
	}

	public abstract boolean verifica(String s);

	public int conteggio(String... strings) {
		int somma = 0;
		for (int i = 0; i < strings.length; i++) {
			if (verifica(strings[i]))
				somma+=1;
		}
		return somma;
	}

}