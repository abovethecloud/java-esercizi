package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrosswordHelper {

	public static void main(String[] args) {
		
		// Creazione del JFrame
		JFrame frame = new JFrame("Crossword Helper");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Impostazione della JMenuBar e dei JMenu e aggiunta al JFrame
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Verifications");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		// Impostazione del GridLayout (2x2) di un nuovo mainPanel e aggiunta al JFrame
		JPanel mainPanel = new JPanel(new GridLayout(2, 2));
		frame.getContentPane().add(mainPanel);
		
		
		// Creazione dei 4 campi del GridLayout del mainPanel
		
		JTextField inputField = new JTextField("INPUT");
		mainPanel.add(inputField);
		
		JTextField outputField = new JTextField("OUTPUT");
		mainPanel.add(outputField);
		
		JTextField nullField = new JTextField("NULL");
		mainPanel.add(nullField);
		
		JPanel buttonPanel = new JPanel();
		JButton button = new JButton();
		button.setSize(100, 200);
		buttonPanel.add(button);
		mainPanel.add(buttonPanel);
		
		
		
		
		
		frame.setVisible(true);
	}
}
