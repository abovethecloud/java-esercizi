package eqsolver.ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import eqsolver.ProxyEquation;

public class EquationPanel extends JPanel implements Observer{

	private static final long serialVersionUID=0;
	
	private JLabel equationModel=new JLabel("-");
	private JLabel equationFormula=new JLabel("-");
	private ProxyEquation proxyEquation;
	
	public EquationPanel(ProxyEquation proxyEquation) {
		this.proxyEquation=proxyEquation;
		proxyEquation.addObserver(this);
		
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new GridLayout(3, 1));
		JLabel equation=new JLabel("Equation");
		add(equation);
		add(equationModel);
		add(equationFormula);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		equationFormula.setText(proxyEquation.toString());
		equationModel.setText(proxyEquation.getFormula());
	}
	
}
