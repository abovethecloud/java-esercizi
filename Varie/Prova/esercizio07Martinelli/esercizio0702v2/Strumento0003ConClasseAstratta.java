package esercizio0702v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Strumento0003ConClasseAstratta  extends AbstractStrumento{
	
	@Override
	public void cambiaOrdineLista(ArrayList<String> list) {
		Collections.shuffle(list);
	}
	
	public List<String> listaInOrdineCasuale(){
		return super.listaConOrdineDifferente();
	}
	
	/*Questo metodo non va messo nella classe Astratta, perché è specifico per questo modulo*/
	public List<String> listaRidotta(int N){
		ArrayList<String> strings=getStrings();
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < strings.size(); i++) {
			String string=strings.get(i);
			if(string.length()<=N){
				list.add(string);
			}
		}
		return list;
	}
}
