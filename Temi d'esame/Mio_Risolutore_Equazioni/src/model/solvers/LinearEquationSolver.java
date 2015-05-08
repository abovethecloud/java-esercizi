package model.solvers;

import java.util.ArrayList;

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

	@Override
	public void solve(ArrayList<Double> data, ArrayList<Double> solution)
			throws EquationException {
		b = data.get(0);
		a = data.get(1);

		double x1 = 0;
		if (a != 0)
			x1 = -(b / a);
		else {
			if (b == 0)
				throw new EquationException("Always true");
			else
				throw new EquationException("Impossible");
		}

		// Clear the solution list and put the result
		solution.clear();
		solution.add(x1);
	}

}
