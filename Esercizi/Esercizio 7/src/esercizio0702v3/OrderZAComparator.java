package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Classe concreta di ordinamento, il cui metodo *specificOrder* definisce
 * l'ordinamento antialfabetico. L'ordinamento non viene qui implementato
 * attraverso il metodo *Collections.reverse(List)*, ma utilizzando
 * l'interfaccia *Comparator<String>*. Dichiarando l'interfaccia e implementando
 * il metro di paragone, ovvero il metodo compare per gli elementi (le stringhe)
 * della lista, è possibile ordinarle sfruttando il metodo
 * *Collections.sort(List, Comparator)*
 * 
 * @author claudio
 *
 */
public class OrderZAComparator implements IOrder, Comparator<String> {

	/*
	 * il "this" all'interno del metodo Collections.sort intende che il
	 * comparator da utilizzare è proprio questa classe, dal momento che essa
	 * stessa dichiara l'interfaccia Comparator e implementa il metodo compare
	 */
	@Override
	public ArrayList<String> specificOrder(ArrayList<String> temporaryList) {
		Collections.sort(temporaryList, this);
		return temporaryList;
	}

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}

}
