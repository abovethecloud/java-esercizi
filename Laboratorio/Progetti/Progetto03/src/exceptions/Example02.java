package exceptions;

public class Example02 {

	
	public static void doSomething() throws Exception{
		
		throw new Exception("Example_02");
		
	}
	
	
	public static void main(String[] args){

		
		try {
			doSomething();
			System.out.println("Not Written Test");
		} catch (Exception e) {
			e.printStackTrace();	// Stack delle chiamate Java (WTF we doin'?)
		}
		
		System.out.println("Riga che mi dimostra che sono arrivato fino a questo punto del codice");
		
	}
}
