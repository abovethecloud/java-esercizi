package model.solvers;

import model.ISolver;
import model.exceptions.EquationException;

/**
 * This class is a model for the solution of an equation like: a*x + b = 0
 * 
 * @author claudio
 *
 */
public class LinearEquationSolver implements ISolver {

	private double a = 0, b = 0;
	private double solution[] = new double[1];

	@Override
	public double[] solve(double[] data) throws EquationException {
		b = data[1];
		a = data[0];

		double x1 = 0;
		if (a != 0)
			x1 = -(b / a);
		else {
			if (b == 0)
				throw new EquationException("Always true");
			else
				throw new EquationException("Impossible");
		}

		solution[0] = x1;

		return solution;
	}

}
