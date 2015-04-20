package eqsolver;

public interface Solver {

	public double[] solveEquation(double parameters[])
		throws EquationException;
}
