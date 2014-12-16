package exceptions;

public class Example03 {

		
	public static void doSomethingBase() throws Exception{
		
		throw new Exception("Example_03");
		
	}
	
	public static void doSomething() throws Exception{
		
		doSomethingBase();
		
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

