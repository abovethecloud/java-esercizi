package ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// Metteremo tutto nel main perché stiamo semplicemente cercando di capire come funziona

public class Example03 {

	public static void main(String[] args) {
		
		JFrame frame = ExamplesUtils.createFrame();

		// commento perché il BorderLayout è di default.
		// frame.getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		panel.setLayout(new GridLayout(3, 1));
		
		/* Creo e aggiungo una semplice e comune casella di testo */
		JTextArea area = new JTextArea();
		panel.add(area);
		
		/* Questa casella di testo NON E' EDITABILE ed è di color CYAN. Di base ha un testo. Viene anche aggiunto un bordo! */
		JTextArea area2 = new JTextArea();
		area2.setBackground(Color.CYAN);	// COLORE
		area2.setEditable(false);	// NON EDITABILE
		area2.setText("Area di testo non editabile");	//TESTO BASE
		panel.add(area2);
		
		area2.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.GREEN));	// BORDO alla casella di testo!

		/* Area di testo con ScrollPane (DECORATOR) */
		JTextArea area3 = new JTextArea();
		area3.setBackground(Color.YELLOW);
		area3.setText("Area di testo con ScrollPane");
		panel.add(area3);
		JScrollPane scrollPane = new JScrollPane(area3);	// ScrollPane è un DECORATOR su JTextArea come su ogni altro componente!
		panel.add(scrollPane);
		
		frame.setVisible(true);
		
	}
}
