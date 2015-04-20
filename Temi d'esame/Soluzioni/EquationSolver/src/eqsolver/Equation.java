package eqsolver;

//Ora Equation è abstract, perchè è stato
//aggiunto il metodo 'getFormula' in IEquation
//Nessuna implementazione di getFormula() 
//avrebbe senso Equation
public abstract class Equation implements IEquation {

	private double[] parameters;
	private Solver solver;
	
	protected Equation(int N){
		parameters=new double[N];
	}
	
	public void setSolver(Solver solver) {
		this.solver = solver;
	}
	
	/* (non-Javadoc)
	 * @see eqsolver.IEquation#solve()
	 */
	@Override
	public double[] solve() throws EquationException{
		return solver.solveEquation(this.parameters);
	}

	/* (non-Javadoc)
	 * @see eqsolver.IEquation#getParametersNumber()
	 */
	@Override
	public int getParametersNumber(){
		return parameters.length;
	}

	/* (non-Javadoc)
	 * @see eqsolver.IEquation#getParameter(int)
	 */
	@Override
	public double getParameter(int index){
		return parameters[index];
	}
	
	/* (non-Javadoc)
	 * @see eqsolver.IEquation#setParameter(int, double)
	 */
	@Override
	public void setParameter(int index,double value){
		parameters[index]=value;
	}
}
