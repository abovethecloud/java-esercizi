package campoMinato.view.test;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;

import campoMinato.model.Casella;
import campoMinato.view.CasellaView;

public class CasellaViewTest {

	@Test
	public void test() {
		// TODO: fail("Not yet implemented");
	}

	public static void main(String[] args) {
		
		// Creo la casella:
		Casella casella = new Casella(2, 1);
		
		// Istanzio il frame
		JFrame frame = new JFrame("CasellaViewTest");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creo il pannello per la casella
		JPanel casellaPanel = new CasellaView(casella);
		
		// Aggiungo il pannello della casella al frame
		frame.getContentPane().add(casellaPanel);
		
		// frame visibile (e disegno)
		frame.setVisible(true);
		
		
	}
}
