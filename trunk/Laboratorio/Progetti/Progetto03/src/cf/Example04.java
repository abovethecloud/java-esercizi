package cf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Example04 {

	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		// Cerchiamo di fare una dizionario
		dictionary.put("Ciao", "Hello");
		dictionary.put("Mondo", "World");
		dictionary.put("Pulcino", "Pulsin");
		dictionary.put("Casa", "Case");
		dictionary.put("Pisello", "Paisel");
		dictionary.put("Cacca", "iMac5K");
		dictionary.put("voglio", "l'iPhone6!");
		dictionary.put("DAMMIT", "DAMMIT");
		
		Set<String> keys = dictionary.keySet();
		
		Set<String> orderedkeys = new TreeSet<String>();
	
		orderedkeys.addAll(keys);
//		Set<String> orderedkeys = new TreeSet<String>();
//		for (String string : keys) {
//			orderedkeys.add(string);
//		}
		
		for (String key	: orderedkeys) {
			String value = dictionary.get(key);
			
			System.out.println(key+" si dice "+value);
		}

	}
}
