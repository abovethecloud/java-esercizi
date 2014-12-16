package exceptions;

public class Example01 {

	public static void main(String[] args){
		
		//
		try {
			throw new Exception("Example_01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Riga che mi dimostra che sono arrivato fino a questo punto del codice");
		
	}
}
