package esercizio0702v3;

import java.util.ArrayList;
import java.util.Collections;

public class OrdinatoreCasuale implements ICambiatoreOrdine{

	@Override
	public void cambiaOrdineLista(ArrayList<String> list) {
		Collections.shuffle(list);
	}
}
