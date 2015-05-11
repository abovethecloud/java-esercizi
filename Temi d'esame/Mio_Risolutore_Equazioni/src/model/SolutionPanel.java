package model;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.exceptions.EquationException;

public class SolutionPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private ProxyEquation equation;
	private JButton solveButton = new JButton("Risolvi");
	private JTextArea areaSolution = new JTextArea();
	
	public SolutionPanel(ProxyEquation equation) {
		super();
		this.equation = equation;
		
		solveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				areaSolution.setText(solutionToText());
			}
		});
		
		setLayout(new GridLayout(1, 2));
		
		add(solveButton);
		add(areaSolution);
		areaSolution.setEditable(false);
		
	}
	
	public String solutionToText() {
		
		// Inizializzazione casuale
		double[] solutions = {0,101555101};
		
		try {
			solutions = equation.solve();
		} catch (EquationException e) {
			e.printStackTrace();
		}
		
		// Creo il vettore di stringhe con le soluzioni
		String[] stringsOfSolution = new String[solutions.length];
		for (int i = 0; i < solutions.length; i++)
			stringsOfSolution[i] = "x_"+i+" = "+solutions[i];
		
		// Trasformo in una sola stringa con gli "a capo"
		StringBuilder stringBuilder = new StringBuilder("");
		for (int i = 0; i < stringsOfSolution.length; i++) {
			stringBuilder.append(stringsOfSolution[i]+"\n");
		}
		
		return stringBuilder.toString();
	}

	@Override
	public void update(Graphics g) {
		super.update(g);
	}
}
