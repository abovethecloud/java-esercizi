package esercizio0702v3;

import java.util.ArrayList;

/**
 * Classe concreta che estende la lista generica e dichiara lo specifico metodo
 * di ordinamento antialfabetico. in realtà questa classe non fa nulla di particolare
 * rispetto alla classe padre. Semplicemente si assicura di effettuare
 * l'ordinamento in modo solo antialfabetico.
 * 
 * @see ListAZ, {@link ListShuffle}, {@link ListSuperClass}
 * @author claudio
 *
 */
public class ListZA extends ListSuperClass {
	
	public ListZA() {
		super(new OrderZA());
	}
	
	public ArrayList<String> orderZA(){
		return super.order();
	}

}
