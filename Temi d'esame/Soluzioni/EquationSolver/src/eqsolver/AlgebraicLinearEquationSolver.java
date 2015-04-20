package eqsolver;

public class AlgebraicLinearEquationSolver implements Solver{

	@Override
	public double[] solveEquation(double[] parameters) throws EquationException {
		
		if(parameters[0]==0){
			if(parameters[1]==0){
				throw new EquationException("Infinite Solutions");
			}else{
				throw new EquationException("No Solutions");
			}
		}
		
		double[] tmp={-parameters[1]/parameters[0]};
		
		return tmp;
	}
}
