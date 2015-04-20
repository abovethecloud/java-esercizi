package eqsolver.main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import eqsolver.ProxyEquation;
import eqsolver.ui.EquationMenu;
import eqsolver.ui.EquationPanel;
import eqsolver.ui.ParametersPanel;
import eqsolver.ui.SolutionsPanel;

public class EquationSolver {

	private static JFrame frame;
	
	public static JFrame getFrame() {
		return frame;
	}

	public static void main(String[] args) {
		
		EquationSolver.frame=new JFrame();
		
		frame.setSize(400,800);
		frame.setTitle("Risolutore di Equazioni");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProxyEquation equation=new ProxyEquation(null);
		
		JMenuBar menubar=new JMenuBar();
		menubar.add(new EquationMenu(equation));
		frame.setJMenuBar(menubar);
		
		JPanel mainPanel=new JPanel();
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(new GridLayout(3, 1));
		
		JPanel equationPanel=new EquationPanel(equation);
		mainPanel.add(equationPanel);
		
		JPanel parametersPanel=new ParametersPanel(equation);
		mainPanel.add(parametersPanel);
		
		JPanel solutionsPanel=new SolutionsPanel(equation);
		mainPanel.add(solutionsPanel);
		
		equation.setEquation(EquationMenu.getLinerEquation());
		
		//JPanel controlPanel=new JPanel();
		//controlPanel.setBackground(Color.YELLOW);
		//mainPanel.add(controlPanel);

		//JPanel outputPanel=new JPanel();
		//outputPanel.setBackground(Color.ORANGE);
		//mainPanel.add(outputPanel);
		//mainPanel.add(outputPanel,BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}





