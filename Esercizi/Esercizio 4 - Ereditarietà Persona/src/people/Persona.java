package people;

import time.Data;

public class Persona {
	
	private String nome;
	private Data nascita;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getNascita() {
		return nascita;
	}

	public void setNascita(Data nascita) {
		this.nascita = nascita.clone();
	}

	
	public Persona(String nome, Data nascita) {
		super();
		setNome(nome);
		setNascita(nascita);
	}

	public int getEta(Data data) {
		return (int) (nascita.diffDate(data)/365);
	}
	

}
