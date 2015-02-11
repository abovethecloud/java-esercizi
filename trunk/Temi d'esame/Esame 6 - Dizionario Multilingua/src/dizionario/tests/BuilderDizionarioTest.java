package dizionario.tests;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import dizionario.model.BuilderDizionario;

public class BuilderDizionarioTest {
	
	public static void main(String[] args) {
		
		BuilderDizionario builderDizionario = new BuilderDizionario();
		
		Set<String> array = builderDizionario.getMapDizionario().keySet();
		
	}

}
