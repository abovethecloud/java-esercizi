package model.test;

import static org.junit.Assert.*;
import model.IEquation;
import model.LinearEquation;
import model.exceptions.EquationException;

import org.junit.Test;

public class EquationTest {
	
	private IEquation equation;

	@Test
	public void testLinear() {
		this.equation = new LinearEquation();
		
		double b = 5;
		double a = -1;
		
		equation.setParameter(0, b);
		equation.setParameter(1, a);
		
		try {
			if (equation.solve()[0] != 5)
				fail("Error in solution");
		} catch (EquationException e) {
			e.printStackTrace();
		}
	}

}
