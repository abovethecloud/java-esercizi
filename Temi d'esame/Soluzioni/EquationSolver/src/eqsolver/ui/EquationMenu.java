package eqsolver.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import eqsolver.AlgebraicLinearEquationSolver;
import eqsolver.AlgebricQuadraticEquationSolver;
import eqsolver.LinearEquation;
import eqsolver.ProxyEquation;
import eqsolver.QuadraticEquation;

public class EquationMenu extends JMenu{

	private static final long serialVersionUID=0;
	private ProxyEquation proxyEquation;

	private static LinearEquation linerEquation=new LinearEquation();
	private static QuadraticEquation quadraticEquation=new QuadraticEquation();
	
	static{
		linerEquation.setSolver(new AlgebraicLinearEquationSolver());
		quadraticEquation.setSolver(new AlgebricQuadraticEquationSolver());
	}

	public static LinearEquation getLinerEquation() {
		return linerEquation;
	}

	public static QuadraticEquation getQuadraticEquation() {
		return quadraticEquation;
	}

	public EquationMenu(ProxyEquation equation) {
		super("Equations");
		
		this.proxyEquation=equation;
		
		JMenuItem linearEquation=new JMenuItem("Linear Eq.");
		linearEquation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				proxyEquation.setEquation(EquationMenu.this.linerEquation);	
			}
		});
		add(linearEquation);
		
		JMenuItem quadraticEquation=new JMenuItem("Quadratic Eq.");
		quadraticEquation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				proxyEquation.setEquation(EquationMenu.this.quadraticEquation);
			}
		});
		add(quadraticEquation);
		
	}
}
