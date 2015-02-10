package tema1.attivita;

/**
 * Una semplice struttura dati contenente il nome di una attività
 * ed il valore intero del suo ricavato giornaliero in euro
 * 
 * @author Alessandro Martinelli
 */
public class Ricavato {

	private String nome;
	private int ricavato;

	public Ricavato(String nome, int ricavato) {
		super();
		this.nome = nome;
		this.ricavato = ricavato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRicavato() {
		return ricavato;
	}
	public void setRicavato(int ricavato) {
		this.ricavato = ricavato;
	}
	
}
