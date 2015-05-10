package view.test;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import view.LinearEquationPanel;

public class EquationMainView {

	public static void main(String[] args) {

		// Creazione del frame, settings relativi e panel principale
		JFrame equationFrame = new JFrame("Equation Frame");
		equationFrame.setSize(500, 500);
		equationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();

		// Creazione del menu di scelta e aggiunta al frame
		JMenuBar menuBar = new JMenuBar();
		JMenu equationsMenu = new JMenu("Menu");
		JMenuItem provaMenuItem = new JMenuItem("prova");
		equationsMenu.add(provaMenuItem);
		menuBar.add(equationsMenu);
		equationFrame.setJMenuBar(menuBar);

		// Creazione dei pannelli
		LinearEquationPanel equationPanel = new LinearEquationPanel();

		// Aggiunta dei pannelli al pannello principale
		mainPanel.setLayout(new GridLayout(1, 1));
		mainPanel.add(equationPanel);

		// Aggiunta del pannello al frame come contentPane()
		equationFrame.getContentPane().add(mainPanel);

		equationFrame.setVisible(true);
	}

}
