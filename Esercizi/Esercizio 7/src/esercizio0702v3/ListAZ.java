package esercizio0702v3;

import java.util.ArrayList;

/**
 * Classe concreta che estende la lista generica e dichiara lo specifico metodo
 * di ordinamento alfabetico. in realtà questa classe non fa nulla di
 * particolare rispetto alla classe padre. Semplicemente si assicura di
 * effettuare l'ordinamento in modo solo alfabetico.
 * 
 * @author claudio
 *
 */
public class ListAZ extends ListSuperClass {

	/**
	 * Metodo costruttore che chiama il costruttore della classe padre SPECIFICO
	 * per l'ordinamento Alfabetico.
	 */
	public ListAZ() {
		super(new OrderAZ());
	}

	/**
	 * Metodo che chiama l'ordinamento della classe padre, che è stato settato
	 * alfabetico con il costruttore specifico di questa classe.
	 * 
	 * @return Retituisce un NUOVO ArrayList di Stringhe ordinato in ordine alfabetico
	 */
	public ArrayList<String> orderAZ() {
		return super.order();
	}

}
