package main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.InputPanel;
import model.Oggetto;

public class Main {

	public static void main(String[] args) {
		// Creazione del frame, settings relativi e panel principale
		JFrame frame = new JFrame("Frame");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		
		Oggetto oggetto = new Oggetto();
		InputPanel pannelloStringa = new InputPanel(oggetto);
		
		mainPanel.setLayout(new GridLayout(2,1));
		mainPanel.add(pannelloStringa);

		
		frame.getContentPane().add(mainPanel);
		
		frame.setVisible(true);
		
		
	}

}
