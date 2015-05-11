package model.test;

import static org.junit.Assert.fail;
import model.ISolver;
import model.exceptions.EquationException;
import model.solvers.LinearEquationSolver;
import model.solvers.QuadraticEquationSolver;

import org.junit.Test;

/**
 * JUnit test that tries to solve the equations.
 * 
 * @author claudio
 *
 */
public class EquationSolveTest {

	private ISolver solver;
	private double[] data;
	private double[] solution;
	
	@Test
	public void testLinearSolve() {	
		
		data = new double[2];
		this.solver = new LinearEquationSolver();

		double a=(-1), b=5;
		System.out.println("Equazione Lineare:\n\t"+a+"*x + "+b+" = 0");
		data[0] = a;
		data[1] = b;
		
		try {
			solution = solver.solve(data);
		} catch (EquationException e) {
			e.printStackTrace();
		}
		System.out.println("Soluzione Equazione Lineare:\n\t"+solution[0]+"\n");

		if (solution[0] != 5)
			fail("ERROR in linear solution");
		
	}
	
	@Test
	public void testQuadraticSolve() {

		data = new double[3];
		this.solver = new QuadraticEquationSolver();
		
		double a = 1, b = -3, c = -4;
		System.out.println("Equazione Quadratica:\n\t"+a+"*x^2 + "+b+"*x + "+c+" = 0");
		data[2] = c;
		data[1] = b;
		data[0] = a;
		
		try {
			solution = solver.solve(data);
		} catch (EquationException e) {
			e.printStackTrace();
		}
		System.out.println("Soluzioni Equazione Quadratica:\n\tx1 = "+solution[0]+"\n\tx2 = "+solution[1]+"\n");
		
		if (solution[0] != -1 || solution[1] != 4)
			fail("ERROR in quadratic solution");
	}

}
