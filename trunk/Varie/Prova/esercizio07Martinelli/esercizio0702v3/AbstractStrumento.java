package esercizio0702v3;

import java.util.ArrayList;
import java.util.List;

public class AbstractStrumento {
	
	private ICambiatoreOrdine cambiatoreOrdine;

	private ArrayList<String> strings=new ArrayList<String>();
	
	public AbstractStrumento(ICambiatoreOrdine cambiatoreOrdine) {
		super();
		this.cambiatoreOrdine = cambiatoreOrdine;
	}

	public ArrayList<String> getStrings() {
		return strings;
	}
	
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
	
	public List<String> listaConOrdineDifferente(){
		ArrayList<String> list=new ArrayList<String>();
		list.addAll(strings);
		cambiatoreOrdine.cambiaOrdineLista(list);//WATCH HERE!!!!!
		return list;
	}
	
}
