package model.solvers;

import model.ISolver;
import model.exceptions.EquationException;

/**
 * Equation like: a*x^2 + b*x + c = 0
 * 
 * @author claudio
 *
 */
public class QuadraticEquationSolver implements ISolver {

	double a = 0, b = 0, c = 0;
	private double solution[] = new double[2];

	@Override
	public double[] solve(double[] data) throws EquationException {
		c = data[2];
		b = data[1];
		a = data[0];

		if (a == 0) {
			/* Se a == 0, risolvo linearmente */
			return (new LinearEquationSolver()).solve(data);
		}

		if (c == 0) {
			/*
			 * chiama la soluzione lineare dopo aver rimosso c dalla lista dei
			 * coefficienti. Aggiunge anche la soluzione x = 0
			 */
			double[] linData = new double[2];
			linData[0] = data[1];
			linData[1] = data[2];
			/*
			 * inserisco le soluzioni nel vettore delle soluzioni nel giusto
			 * ordine
			 */
			solution[0] = 0;
			solution[1] = (new LinearEquationSolver()).solve(linData)[0];

			if (solution[0] > solution[1]) {
				double tmp = solution[1];
				solution[1] = solution[0];
				solution[0] = tmp;
			}
			return solution;
		}

		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

		if (delta < 0)
			throw new EquationException("Impossible. Delta < 0");

		double x1 = (-b - delta) / 2 * a;
		double x2 = (-b + delta) / 2 * a;

		solution[0] = x1;
		solution[1] = x2;

		return solution;
	}

}
