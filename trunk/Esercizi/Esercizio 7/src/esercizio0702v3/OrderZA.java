package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;

public class OrderZA implements IOrder {
	
	@Override
	public ArrayList<String> specificOrder(ArrayList<String> temporaryList) {
		Collections.sort(temporaryList);
		Collections.reverse(temporaryList);
		return temporaryList; 
	}

}
