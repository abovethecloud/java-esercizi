package eqsolver.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import eqsolver.EquationException;
import eqsolver.ProxyEquation;

public class SolutionsPanel extends JPanel{

	private static final long serialVersionUID=0;
	
	private JLabel solution=new JLabel();
	private ProxyEquation equation;
	
	public SolutionsPanel(ProxyEquation equation) {
		this.equation=equation;
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new BorderLayout());
		JButton solveButton=new JButton("Solve");
		add(solveButton,BorderLayout.NORTH);
		add(solution);
		
		solveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				executeAction();
			}
		});
	}

	public void executeAction(){
		try {
			double[] d=equation.solve();
			
			String s="";
			
			for (int i = 0; i < d.length; i++) {
				s+="x_"+i+"="+d[i]+" ";
			}
			
			solution.setText(s);
			
		} catch (EquationException e) {
			EquationErrorDialog dialog=new EquationErrorDialog(e);
			dialog.setVisible(true);
		}
	}
}
