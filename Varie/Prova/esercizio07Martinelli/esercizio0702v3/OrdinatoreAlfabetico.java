package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;

public class OrdinatoreAlfabetico implements ICambiatoreOrdine{

	@Override
	public void cambiaOrdineLista(ArrayList<String> list) {
		Collections.sort(list);
	}
}
