package model;

import model.exceptions.EquationException;

public class LinearEquation implements IEquation {

	private ISolver solver;
	private double[] paramters;
	
	@Override
	public double[] solve() throws EquationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getParametersNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getParameter(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setParameter(int index, double value) {
		// TODO Auto-generated method stub

	}

}
