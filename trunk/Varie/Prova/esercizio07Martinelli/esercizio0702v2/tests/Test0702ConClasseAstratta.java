package esercizio0702v2.tests;

import java.util.List;

import esercizio0702v2.Strumento0001ConClasseAstratta;
import esercizio0702v2.Strumento0002ConClasseAstratta;
import esercizio0702v2.Strumento0003ConClasseAstratta;

public class Test0702ConClasseAstratta {

	public static void main(String[] args) {
		test0001();
		test0002();
		test0003();
	}
	
	public static void test0001(){
		
		Strumento0001ConClasseAstratta strumento=new Strumento0001ConClasseAstratta();
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
		
		Strumento0002ConClasseAstratta strumento=new Strumento0002ConClasseAstratta();
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
		
		Strumento0003ConClasseAstratta strumento=new Strumento0003ConClasseAstratta();
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
