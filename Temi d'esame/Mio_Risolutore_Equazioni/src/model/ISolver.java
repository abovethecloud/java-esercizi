package model;

import java.util.ArrayList;

import model.exceptions.EquationException;

/**
 * Interface for different solvers. Different solvers solve different types of
 * equations
 * 
 * @author claudio
 *
 */
public interface ISolver {

	/**
	 * Fills a List with the solution of the equation given a list of data.
	 * 
	 * @param data
	 *            ArrayList of double containing the parameters of the equation.
	 *            WARNING: in case the equation is polynomial, the first value
	 *            is the coefficient of x^0, the second is the coeff. of x^1 and
	 *            sol on..
	 * @param solution
	 *            ArrayList that contains all the possbile solutions from the
	 *            smallest to the greatest
	 */
	public double[] solve(double[] data) throws EquationException;

}
