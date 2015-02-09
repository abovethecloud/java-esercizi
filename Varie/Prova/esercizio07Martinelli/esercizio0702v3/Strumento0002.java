package esercizio0702v3;

import java.util.List;

public class Strumento0002 extends AbstractStrumento{
	
	public Strumento0002() {
		super(new OrdinatoreAntiAlfabetico());
	}
	
	public List<String> listaInOrdineAlfabeticoContrario(){
		return super.listaConOrdineDifferente();
	}

}
