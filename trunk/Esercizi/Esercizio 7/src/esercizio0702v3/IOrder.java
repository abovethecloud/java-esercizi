package esercizio0702v3;

import java.util.ArrayList;

/**
 * Interfaccia generica di ordinamento. Serve a nascondere le diverse
 * implementazioni concrete del metodo *specificOrder*, che varia per ogni
 * tipologia di Strumento (ListaAZ, ListaZA e ListaShuffle)
 * 
 * @author claudio
 *
 */
public interface IOrder {

	/**
	 * Metodo che accetta un ArrayList di String e lo restituisce ordinato secondo
	 * un particolare criterio
	 * 
	 * @param temporaryList
	 *            Rappresenta l'ArrayList di String da ordinare
	 * @return L'arrayList ordinato secondo un criterio
	 */
	public abstract ArrayList<String> specificOrder(
			ArrayList<String> temporaryList);

}