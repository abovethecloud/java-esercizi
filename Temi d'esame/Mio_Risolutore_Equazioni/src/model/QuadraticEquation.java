package model;

import model.exceptions.EquationException;
import model.solvers.QuadraticEquationSolver;

public class QuadraticEquation implements IEquation {

	private ISolver solver;
	private double[] paramters;
	
	public QuadraticEquation() {
		this.solver = new QuadraticEquationSolver();
		paramters = new double[3];
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
