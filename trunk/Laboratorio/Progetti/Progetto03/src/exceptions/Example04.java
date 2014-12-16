package exceptions;

public class Example04 {

		
	public static void doSomethingBase() {
		
		throw new RuntimeException("Example_04");
		
	}
	
	public static void doSomething() {
		
		doSomethingBase();
		
	}
	
	
	public static void main(String[] args){

		
		doSomething();
			
		System.out.println("Riga che mi dimostra che sono arrivato fino a questo punto del codice");
		
	}
}

