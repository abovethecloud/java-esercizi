package prova;

public class Prova {
	
	public int a;
	
	public Prova(int a) {
		this.a = a;
	}
	
	public Prova generaProva(int a, Prova prova) {
		return new Prova(a);
	}
	
	public Prova cacca(){
		return generaProva(1, this);
	}

}
