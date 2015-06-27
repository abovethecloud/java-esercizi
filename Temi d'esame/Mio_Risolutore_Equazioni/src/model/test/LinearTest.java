package model.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.ISolver;
import model.LinearEquationSolver;

import org.junit.Test;

public class LinearTest {

	private ISolver solver;
	
	@Test
	public void testLinearSolve() {
		
		this.solver = new LinearEquationSolver();
		
		ArrayList<Double> data = new ArrayList<Double>();
		ArrayList<Double> solution = new ArrayList<Double>();

		double a=(-1), b=5;
		System.out.println("Equazione Lineare:\n\t"+a+"*x + "+b+" = 0");
		data.add(a);
		data.add(b);
		
		solver.solve(data, solution);
		System.out.println("Soluzione Equazione Lineare:\n\t"+solution.get(0));

		if (solution.get(0) != 5)
			fail("ERROR in linear solution");
		
	}

}
