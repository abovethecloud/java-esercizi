package model;

import model.exceptions.EquationException;
import model.solvers.LinearEquationSolver;

public class LinearEquation implements IEquation {

	private ISolver solver;
	private double[] paramters;
	
	/*
	 * DP STRATEGY: dipendiamo dal risolutore linare di default.
	 */
	public LinearEquation() {
		super();
		solver = new LinearEquationSolver();
		paramters = new double[2];
	}
	
	@Override
	public double[] solve() throws EquationException {
		return solver.solve(paramters);
	}
	
	@Override
	public void setSolver(ISolver solver) {
		this.solver = solver;
	}

	@Override
	public int getParametersNumber() {
		return paramters.length;
	}

	@Override
	public double getParameter(int index) {
		return paramters[index];
	}

	@Override
	public void setParameter(int index, double value) {
		paramters[index] = value;
	}

}
