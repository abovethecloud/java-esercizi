package view.test;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
		JPanel equationPanel = new JPanel();
		equationPanel.setLayout(new GridLayout(2, 2));
		JTextArea areaA = new JTextArea("a ="), areaB = new JTextArea("b =");
		JTextField fieldA = new JTextField(), fieldB = new JTextField();
		equationPanel.add(areaA);
		equationPanel.add(fieldA);
		
		equationPanel.add(areaB);
		equationPanel.add(fieldB);
		
		
		// Aggiunta del pannello al frame come contentPane()
		equationFrame.getContentPane().add(equationPanel);
		
		
		
		equationFrame.setVisible(true);
	}

}
