package view.test;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import view.LinearEquationPanel;

public class EquationMainView {

	public static void main(String[] args) {
		
		// Creazione del frame e settings relativi
		JFrame equationFrame = new JFrame("Equation Frame");
		equationFrame.setSize(500, 500);
		equationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creazione del menu di scelta e aggiunta al frame
		JMenuBar menuBar = new JMenuBar();
		JMenu equationsMenu = new JMenu("Menu");
		JMenuItem provaMenuItem = new JMenuItem("prova");
		equationsMenu.add(provaMenuItem);
		menuBar.add(equationsMenu);
		equationFrame.setJMenuBar(menuBar);
		
		// Creazione del pannello principale e settings relativi
		LinearEquationPanel equationPanel = new LinearEquationPanel();		
		
		// Aggiunta del pannello al frame come contentPane()
		equationFrame.getContentPane().add(equationPanel);
		
		
		
		equationFrame.setVisible(true);
	}

}
