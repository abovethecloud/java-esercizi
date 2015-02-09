package esercizio0702v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Strumento0002ConCodiceDuplicato {

	private ArrayList<String> strings=new ArrayList<String>();
	
	public void addString(String... strings){
		for (int i = 0; i < strings.length; i++) {
			this.strings.add(strings[i]);
		}
	}
	
	public int contaOccorrenze(char c){
		
		int somma=0;
		for (int i = 0; i < strings.size(); i++) {
			char[] array=strings.get(i).toCharArray();
			for (int j = 0; j < array.length; j++) {
				if(array[j]==c){
					somma++;
				}
			}
		}
		return somma;
	}
	
	public List<String> listaInOrdineAlfabeticoContrario(){
		ArrayList<String> list=new ArrayList<String>();
		list.addAll(strings);
		Collections.sort(list,new Comparator<String>() {
			public int compare(String string1, String string2) {
				return string2.compareTo(string1);
			}
		});
		return list;
	}
}
