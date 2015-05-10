package model;

import model.exceptions.EquationException;

public interface IEquation {
	
	public abstract double[] solve() throws EquationException;

	
	public abstract void setSolver(ISolver solver);

	public abstract int getParametersNumber();

	public abstract double getParameter(int index);

	public abstract void setParameter(int index, double value);
}
