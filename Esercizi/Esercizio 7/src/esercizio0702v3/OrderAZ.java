package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe concreta di ordinamento, il cui metodo *specificOrder* definisce
 * l'ordinamento alfabetico
 * 
 * @author claudio
 *
 */
public class OrderAZ implements IOrder {

	@Override
	public ArrayList<String> specificOrder(ArrayList<String> temporaryList) {
		Collections.sort(temporaryList);
		return temporaryList;
	}

}
