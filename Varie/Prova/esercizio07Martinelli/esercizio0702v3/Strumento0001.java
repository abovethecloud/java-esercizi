package esercizio0702v3;

import java.util.List;

public class Strumento0001 extends AbstractStrumento{
	
	public Strumento0001() {
		super(new OrdinatoreAlfabetico());
	}
	
	public List<String> listaInOrdineAlfabetico(){
		return super.listaConOrdineDifferente();
	}
}
