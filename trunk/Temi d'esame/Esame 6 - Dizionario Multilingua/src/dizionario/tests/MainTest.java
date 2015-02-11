package dizionario.tests;

import javax.swing.JFrame;

import dizionario.ui.MenuBarDizionario;
import dizionario.ui.SuperPanel;

public class MainTest {
	
	public static void main(String[] args) {
		
		// Creo il SuperPanel
		SuperPanel panel = new SuperPanel();
		
		
		// Aggiungo un frame e setto le cose principali
		JFrame frame = new JFrame("Cippa");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuBarDizionario menuBarDizionario = new MenuBarDizionario();
		
		frame.getContentPane().add(panel);
		frame.setJMenuBar(menuBarDizionario);
		
		
		frame.setVisible(true);
	}

}
