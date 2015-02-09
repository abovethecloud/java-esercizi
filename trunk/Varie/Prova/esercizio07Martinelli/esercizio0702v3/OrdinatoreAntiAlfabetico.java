package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdinatoreAntiAlfabetico implements ICambiatoreOrdine,Comparator<String>{

	@Override
	public void cambiaOrdineLista(ArrayList<String> list) {
		Collections.sort(list,this);
	}
	
	public int compare(String string1, String string2) {
		return string2.compareTo(string1);
	}
}
