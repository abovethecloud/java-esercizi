package eqsolver;

public class LinearEquation extends Equation /*implements IEquation*/{

	public LinearEquation() {
		super(2);
	}
	
	public String getFormula(){
		return "ax + b = 0";
	}
	
	@Override
	public String toString() {
		return getParameter(0)+"x +"+getParameter(1)+" = 0";
	}
}
