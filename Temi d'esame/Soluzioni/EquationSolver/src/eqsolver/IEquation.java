package eqsolver;

public interface IEquation {

	public abstract double[] solve()  throws EquationException;

	public abstract int getParametersNumber();

	public abstract double getParameter(int index);

	public abstract void setParameter(int index, double value);

	public abstract String getFormula();
}