package ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Metteremo tutto nel main perché stiamo semplicemente cercando di capire come funziona

public class Example04 {

	public static void main(String[] args) {
		
		/* Istanzio il frame di tipo ExampleUtils */
		JFrame frame = ExamplesUtils.createFrame();
		
		/* Creo la MnuBar, il menu e vi aggiungo i MenuItem */
		JMenuBar menubar = new JMenuBar();
			JMenu menu = new JMenu("Ordinamenti");
			menubar.add(menu);
			JMenuItem menuItem01 = new JMenuItem("A-Z");
			menu.add(menuItem01);
			JMenuItem menuItem02 = new JMenuItem("Z-A");
			menu.add(menuItem02);			
			JMenuItem menuItem03 = new JMenuItem("Casuale");
			menu.add(menuItem03);
		frame.setJMenuBar(menubar);
		
		/* Aggiungo il SUPERpannello con Layout al frame (conterrà 2 pannelli) */
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		frame.getContentPane().add(panel);
		
		/* Il pannel1 contiene a sua volta 2 componenti in un GridLayout: un JTextField e un JButton */
		JPanel panel1 = new JPanel();
			panel1.setLayout(new GridLayout(2, 1));
			panel.add(panel1);
					
			JTextField field = new JTextField("Scrivi qui");
			panel1.add(field);
			
			JButton button = new JButton ("Aggiungi");
			panel1.add(button);
			
		/* Il pannel2 contiene 1 solo componente in un GridLayout(1,1): una JTextArea */
		JPanel panel2 = new JPanel();
			panel2.setLayout(new GridLayout(1,1));
			panel.add(panel2);
			
			JTextArea area = new JTextArea("elenco..");
			area.setEnabled(false);
			panel2.add(area);
		
		frame.setVisible(true);
		
	}
}
