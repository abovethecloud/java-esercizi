package eqsolver;

public class AlgebricQuadraticEquationSolver implements Solver{

	@Override
	public double[] solveEquation(double[] parameters) throws EquationException {
		
		double a=parameters[0];
		double b=parameters[1];
		double c=parameters[2];
		
		if(a==0){
			return solveLinear(b, c);
		}else{
			double delta=b*b-4*a*c;
			if(delta<0){
				throw new EquationException("No Solutions");
			}else{

				double sqrtDelta=Math.sqrt(delta);
				double rec2a=1.0/(2*a);
				double[] tmp={(-b+sqrtDelta)*rec2a,(-b-sqrtDelta)*rec2a};
				return tmp;
			}
		}
		
	}

	private double[] solveLinear(double b, double c) throws EquationException {
		//NOTA: questo codice è duplicato rispetto a quello
		//che c'è in AlgebraicLinearEquationSolver
		if(b==0){
			if(c==0){
				throw new EquationException("Infinite Solutions");
			}else {
				throw new EquationException("No Solutions");
			}
		}else{
			double[] tmp={-c/b};
			return tmp;
		}
	}
}
