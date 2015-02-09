package esercizio0702v3.tests;

import java.util.List;

import esercizio0702v3.Strumento0001;
import esercizio0702v3.Strumento0002;
import esercizio0702v3.Strumento0003;

public class Test0702 {

	public static void main(String[] args) {
		test0001();
		test0002();
		test0003();
	}
	
	public static void test0001(){
		
		Strumento0001 strumento=new Strumento0001();
		strumento.addString("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");
		
		System.out.println("Conta occorrenze 'a' "+strumento.contaOccorrenze('a'));
		System.out.println("Conta occorrenze 's' "+strumento.contaOccorrenze('s'));
		System.out.println("Conta occorrenze 'S' "+strumento.contaOccorrenze('S'));
		System.out.println("Conta occorrenze 'o' "+strumento.contaOccorrenze('o'));
		System.out.println("Conta occorrenze 'O' "+strumento.contaOccorrenze('O'));
		
		List<String> lista=strumento.listaInOrdineAlfabetico();
		for (String string : lista) {
			System.out.println("In Ordine Alfabetico : "+string);
		}
	}
	
	public static void test0002(){
		
		Strumento0002 strumento=new Strumento0002();
		strumento.addString("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");
		
		System.out.println("Conta occorrenze 'a' "+strumento.contaOccorrenze('a'));
		System.out.println("Conta occorrenze 's' "+strumento.contaOccorrenze('s'));
		System.out.println("Conta occorrenze 'S' "+strumento.contaOccorrenze('S'));
		System.out.println("Conta occorrenze 'o' "+strumento.contaOccorrenze('o'));
		System.out.println("Conta occorrenze 'O' "+strumento.contaOccorrenze('O'));
		
		List<String> lista=strumento.listaInOrdineAlfabeticoContrario();
		for (String string : lista) {
			System.out.println("In Ordine Alfabetico al Contrario : "+string);
		}
	}
	

	public static void test0003(){
		
		Strumento0003 strumento=new Strumento0003();
		strumento.addString("Pasta","Sale","Pepe","Olio","Tavolo","Sedia");
		
		System.out.println("Conta occorrenze 'a' "+strumento.contaOccorrenze('a'));
		System.out.println("Conta occorrenze 's' "+strumento.contaOccorrenze('s'));
		System.out.println("Conta occorrenze 'S' "+strumento.contaOccorrenze('S'));
		System.out.println("Conta occorrenze 'o' "+strumento.contaOccorrenze('o'));
		System.out.println("Conta occorrenze 'O' "+strumento.contaOccorrenze('O'));
		
		List<String> lista=strumento.listaInOrdineCasuale();
		for (String string : lista) {
			System.out.println("In Ordine casuale : "+string);
		}

		List<String> listaRidotta=strumento.listaRidotta(4);
		for (String string : listaRidotta) {
			System.out.println("Parole con massimo 4 caratteri : "+string);
		}
	}
}
