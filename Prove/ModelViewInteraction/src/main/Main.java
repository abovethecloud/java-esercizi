package main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.ProxyOggetto;
import view.InputPanel;
import view.OutputPanel;

public class Main {

	public static void main(String[] args) {
		// Creazione del frame, settings relativi e panel principale
		JFrame frame = new JFrame("Frame");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();

		ProxyOggetto oggetto = new ProxyOggetto();
		InputPanel inputPanel = new InputPanel(oggetto);
		OutputPanel outputPanel = new OutputPanel(oggetto);

		mainPanel.setLayout(new GridLayout(2, 1));
		mainPanel.add(inputPanel);
		mainPanel.add(outputPanel);

		frame.getContentPane().add(mainPanel);

		frame.setVisible(true);

	}

}
