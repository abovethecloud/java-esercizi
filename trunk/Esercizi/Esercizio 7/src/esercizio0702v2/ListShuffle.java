package esercizio0702v2;

import java.util.ArrayList;
import java.util.Collections;

public class ListShuffle extends ListSuperClassAbstract {
	
	@Override
	public ArrayList<String> specificOrder(ArrayList<String> temporaryList) {
		Collections.shuffle(temporaryList);
		return temporaryList; 
	}

}
