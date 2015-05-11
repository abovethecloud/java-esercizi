package model;

import java.util.Observable;

import model.exceptions.EquationException;

/**
 * This class is the proxy class for the IEquation type. It extends Observable,
 * so that the GUI can change accordingly to the type of Equation.
 * 
 * @author claudio
 *
 */
public class ProxyEquation extends Observable implements IEquation {

	// TODO: Per ora il DEFAULT è l'equazione lineare
	private IEquation equation = new LinearEquation();
	
	public ProxyEquation() {
	}

	public ProxyEquation(IEquation equation) {
		setEquation(equation);
		setChanged();
		notifyObservers();
	}

	public void setEquation(IEquation equation) {
		if (equation != null)
			this.equation = equation;
		else
			System.err.println("Si è cercato di settare un'equazione NULL");
	}

	@Override
	public double[] solve() throws EquationException {
		return equation.solve();
	}

	@Override
	public void setSolver(ISolver solver) {
		equation.setSolver(solver);
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
		setChanged();
		notifyObservers();
	}

}
