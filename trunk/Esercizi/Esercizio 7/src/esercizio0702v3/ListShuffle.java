package esercizio0702v3;

import java.util.ArrayList;

/**
 * Classe concreta che estende la lista generica e dichiara lo specifico metodo
 * di ordinamento casuale. in realtà questa classe non fa nulla di particolare
 * rispetto alla classe padre. Semplicemente si assicura di effettuare
 * l'ordinamento in modo solo casuale.
 * 
 * @see ListAZ, ListZA, ListSuperClass
 * @author claudio
 *
 */
public class ListShuffle extends ListSuperClass {

	public ListShuffle() {
		super(new OrderShuffle());
	}

	public ArrayList<String> orderShuffle() {
		return super.order();
	}

}
