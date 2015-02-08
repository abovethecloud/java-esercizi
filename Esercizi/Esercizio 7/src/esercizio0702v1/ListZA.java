package esercizio0702v1;

import java.util.ArrayList;
import java.util.Collections;

public class ListZA {
	
	private ArrayList<String> stringList = new ArrayList<String>();
	
	public void addStrings(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			this.stringList.add(strings[i]);
		}
	}
	
	public int countChar (Character character) {
		int conteggio = 0;
		for (String string : this.stringList) {
			for (int i = 0; i < string.length(); i++) {
				if (character == string.charAt(i))
					conteggio+=1;
			}
		}
		return conteggio;
	}
	
	public ArrayList<String> order() {
		@SuppressWarnings("unchecked") // TODO
		ArrayList<String> temporaryList = ((ArrayList<String>) stringList.clone());
		
		Collections.sort(temporaryList);
		Collections.reverse(temporaryList);
		return temporaryList;
	}
	


}
