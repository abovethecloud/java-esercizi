package model;

import java.util.ArrayList;

/**
 * Interface for different solvers. Different solvers solve different types of
 * equations
 * 
 * @author claudio
 *
 */
public interface ISolver {

	public void solve(ArrayList<Double> data, ArrayList<Double> solution);

}
