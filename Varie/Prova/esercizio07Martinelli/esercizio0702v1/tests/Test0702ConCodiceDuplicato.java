package esercizio0702v1.tests;

import java.util.List;

import esercizio0702v1.Strumento0001ConCodiceDuplicato;
import esercizio0702v1.Strumento0002ConCodiceDuplicato;
import esercizio0702v1.Strumento0003ConCodiceDuplicato;

public class Test0702ConCodiceDuplicato {

	public static void main(String[] args) {
		test0001();
		test0002();
		test0003();
	}
	
	public static void test0001(){
		
		Strumento0001ConCodiceDuplicato strumento=new Strumento0001ConCodiceDuplicato();
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
		
		Strumento0002ConCodiceDuplicato strumento=new Strumento0002ConCodiceDuplicato();
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
		
		Strumento0003ConCodiceDuplicato strumento=new Strumento0003ConCodiceDuplicato();
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
