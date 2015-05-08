package model.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.ISolver;
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
	ArrayList<Double> data = new ArrayList<Double>();
	ArrayList<Double> solution = new ArrayList<Double>();
	
	@Test
	public void testLinearSolve() {	
		data.clear();
		solution.clear();
		
		this.solver = new LinearEquationSolver();

		double a=(-1), b=5;
		System.out.println("Equazione Lineare:\n\t"+a+"*x + "+b+" = 0");
		data.add(b);
		data.add(a);
		
		solver.solve(data, solution);
		System.out.println("Soluzione Equazione Lineare:\n\t"+solution.get(0)+"\n");

		if (solution.get(0) != 5)
			fail("ERROR in linear solution");
		
	}
	
	@Test
	public void testQuadraticSolve() throws Exception {
		data.clear();
		solution.clear();
		
		this.solver = new QuadraticEquationSolver();
		
		double a = 1, b = -3, c = -4;
		System.out.println("Equazione Quadratica:\n\t"+a+"*x^2 + "+b+"*x + "+c+" = 0");
		data.add(c);
		data.add(b);
		data.add(a);
		
		solver.solve(data, solution);
		System.out.println("Soluzioni Equazione Quadratica:\n\tx1 = "+solution.get(0)+"\n\tx2 = "+solution.get(1)+"\n");
		
		if (solution.get(0) != -1 || solution.get(1) != 4)
			fail("ERROR in quadratic solution");
	}

}
