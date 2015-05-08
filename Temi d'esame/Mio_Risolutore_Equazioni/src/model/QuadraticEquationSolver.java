package model;

import java.util.ArrayList;

/**
 * Equation like: a*x^2 + b*x + c = 0
 * 
 * @author claudio
 *
 */
public class QuadraticEquationSolver implements ISolver {

	double a = 0, b = 0, c = 0;

	@Override
	public void solve(ArrayList<Double> data, ArrayList<Double> solution) {
		c = data.get(0);
		b = data.get(1);
		a = data.get(2);

		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

		double x1 = (-b - delta) / 2 * a;
		double x2 = (-b + delta) / 2 * a;

		solution.clear();
		solution.add(x1);
		solution.add(x2);

	}

}
