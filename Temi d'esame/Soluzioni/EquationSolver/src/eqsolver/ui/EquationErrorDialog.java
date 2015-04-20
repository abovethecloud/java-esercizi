package eqsolver.ui;

import javax.swing.JDialog;
import javax.swing.JLabel;

import eqsolver.EquationException;
import eqsolver.main.EquationSolver;

public class EquationErrorDialog extends JDialog{

	public EquationErrorDialog(EquationException exception) {
		super(EquationSolver.getFrame(),true);
		setSize(400,400);
		getContentPane().add(new JLabel(exception.getMessage()));
	}
}
