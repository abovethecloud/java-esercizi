package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Metteremo tutto nel main perché stiamo semplicemente cercando di capire come funziona

public class Example01 {

	public static void main(String[] args) {
		
		JFrame frame = ExamplesUtils.createFrame();
		
		// commento perché il BorderLayout è di default.
//		frame.getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.RED);
		frame.getContentPane().add(panel1, BorderLayout.SOUTH);
		
//		panel.setLayout(new FlowLayout());

		JButton button1 = new JButton("Pulsante1");
		panel.add(button1);
		
		JButton button2 = new JButton("Pulsante2");
		panel.add(button2);
		
		JButton button3 = new JButton("Pulsante3");
		panel.add(button3);
		
		JButton button4 = new JButton("Pulsante3");
		panel1.add(button4);
		
		frame.setVisible(true);
		
	}
}
