package esercizio0702v2;

import java.util.ArrayList;
import java.util.Collections;

public class ListZA extends ListSuperClassAbstract {
	
	@Override
	public ArrayList<String> specificOrder(ArrayList<String> temporaryList) {
		Collections.reverse(temporaryList);
		return temporaryList; 
	}

}
