package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe concreta di ordinamento, il cui metodo *specificOrder* definisce
 * l'ordinamento casuale
 * 
 * @author claudio
 *
 */
public class OrderShuffle implements IOrder {
	
	@Override
	public ArrayList<String> specificOrder(ArrayList<String> temporaryList) {
		Collections.shuffle(temporaryList);
		return temporaryList; 
	}

}
