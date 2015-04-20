package eqsolver;

public class QuadraticEquation extends Equation{

	public QuadraticEquation() {
		super(3);
	}

	public String getFormula(){
		return "ax^2 + b x + c = 0";
	}
	
	@Override
	public String toString() {
		return getParameter(0)+"x^2 +"+getParameter(1)+"x "+
			getParameter(2)+"= 0";
	}
}
