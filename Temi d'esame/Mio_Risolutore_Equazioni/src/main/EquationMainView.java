package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import model.LinearEquation;
import model.ProxyEquation;
import model.SolutionPanel;
import view.InputPanel;
import view.MenuEquation;
import view.OutputPanel;

public class EquationMainView {

	public static void main(String[] args) {
		
		// Dichiarazione di un'equazione con defualt LINEARE
		ProxyEquation proxyEquation = new ProxyEquation();

		// Creazione del frame, settings relativi e panel principale
		JFrame equationFrame = new JFrame("Equation Frame");
		equationFrame.setSize(500, 500);
		equationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();

		// Creazione del menu di scelta e aggiunta al frame
		JMenuBar menuBar = new JMenuBar();
		MenuEquation menuEquation = new MenuEquation(proxyEquation);
		menuBar.add(menuEquation);
		equationFrame.setJMenuBar(menuBar);

		// Creazione dei pannelli
		InputPanel inputPanel = new InputPanel(proxyEquation);
		OutputPanel outputPanel = new OutputPanel(proxyEquation);
		SolutionPanel solutionPanel = new SolutionPanel(proxyEquation);

		// Aggiunta dei pannelli al pannello principale
		mainPanel.setLayout(new GridLayout(3, 1));
		mainPanel.add(outputPanel);
		mainPanel.add(inputPanel);
		mainPanel.add(solutionPanel);

		// Aggiunta del pannello al frame come contentPane()
		equationFrame.getContentPane().add(mainPanel);

		equationFrame.setVisible(true);
	}

}
