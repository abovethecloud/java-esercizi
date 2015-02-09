package esercizio0702v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Strumento0001ConClasseAstratta extends AbstractStrumento{
	
	@Override
	public void cambiaOrdineLista(ArrayList<String> list) {
		Collections.sort(list);
	}
	
	public List<String> listaInOrdineAlfabetico(){
		return super.listaConOrdineDifferente();
	}
}
