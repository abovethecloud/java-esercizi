package eqsolver;

import java.util.Observable;

public class ProxyEquation extends Observable implements IEquation {

	private IEquation equation;
	
	public ProxyEquation(IEquation equation) {
		super();
		this.equation = equation;
	}

	public void setEquation(IEquation equation) {
		this.equation = equation;
		update();
	}

	@Override
	public String getFormula() {
		return equation.getFormula();
	}
	
	@Override
	public double[] solve() throws EquationException{
		return equation.solve();
	}
	
	public void update(){
		setChanged();
		notifyObservers();
	}

	@Override
	public int getParametersNumber() {
		return equation.getParametersNumber();
	}

	@Override
	public double getParameter(int index) {
		return equation.getParameter(index);
	}

	@Override
	public void setParameter(int index, double value) {
		equation.setParameter(index, value);
		update();
	}

	@Override
	public String toString() {
		return equation.toString();
	}
}
