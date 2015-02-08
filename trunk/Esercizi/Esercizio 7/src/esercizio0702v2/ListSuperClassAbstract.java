package esercizio0702v2;

import java.util.ArrayList;
import java.util.Collections;

public abstract class ListSuperClassAbstract {

	protected ArrayList<String> stringList = new ArrayList<String>();


	public ListSuperClassAbstract() {
		super();
	}

	public void addStrings(String... strings) {
	
		for (int i = 0; i < strings.length; i++) {
			this.stringList.add(strings[i]);
		}
	}

	public int countChar(Character character) {
		int conteggio = 0;
		for (String string : stringList) {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == character)
					conteggio+=1;	
			}
		}
		return conteggio;
	}
	
	public ArrayList<String> order() {
		ArrayList<String> temporaryList = new ArrayList<String>();
		temporaryList.addAll(stringList);
		Collections.sort(temporaryList);
		
		specificOrder(temporaryList);

		return temporaryList; 
	}
	
	public abstract ArrayList<String> specificOrder(ArrayList<String> temporaryList);

}