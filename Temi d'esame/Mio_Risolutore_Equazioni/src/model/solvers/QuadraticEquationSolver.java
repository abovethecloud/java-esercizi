package model.solvers;

import java.util.ArrayList;

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

	@Override
	public void solve(ArrayList<Double> data, ArrayList<Double> solution)
			throws EquationException {
		c = data.get(0);
		b = data.get(1);
		a = data.get(2);

		if (a == 0) {
			/* Se a == 0, risolvo linearmente */
			(new LinearEquationSolver()).solve(data, solution);
			return;
		}

		if (c == 0) {
			/*
			 * chiama la soluzione lineare dopo aver rimosso c dalla lista dei
			 * coefficienti. Aggiunge anche la soluzione x = 0
			 */
			data.remove(0);
			(new LinearEquationSolver()).solve(data, solution);
			solution.add(0.0);
			// TODO: A onor del vero qui si dovrebbe inserire lo 0 prima o dopo
			// a seconda della dimensione dell'altra soluzione
			return;
		}

		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
		if (delta < 0)
			throw new EquationException("Impossible. Delta < 0");

		double x1 = (-b - delta) / 2 * a;
		double x2 = (-b + delta) / 2 * a;

		solution.clear();
		solution.add(x1);
		solution.add(x2);

	}

}
