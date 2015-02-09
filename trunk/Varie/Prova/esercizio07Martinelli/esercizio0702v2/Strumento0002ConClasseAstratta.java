package esercizio0702v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Strumento0002ConClasseAstratta extends AbstractStrumento{
	
	@Override
	public void cambiaOrdineLista(ArrayList<String> list) {
		Collections.sort(list,new Comparator<String>() {
			public int compare(String string1, String string2) {
				return string2.compareTo(string1);
			}
		});
	}
	
	public List<String> listaInOrdineAlfabeticoContrario(){
		return super.listaConOrdineDifferente();
	}

}
