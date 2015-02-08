package esercizio0702v1;

import java.util.ArrayList;
import java.util.Collections;

public class ListAZ {

	private ArrayList<String> stringList = new ArrayList<String>();

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
		@SuppressWarnings("unchecked")
		ArrayList<String> temporaryList = ((ArrayList<String>) stringList.clone());
		
		Collections.sort(temporaryList);

		return temporaryList; 
	}

}
