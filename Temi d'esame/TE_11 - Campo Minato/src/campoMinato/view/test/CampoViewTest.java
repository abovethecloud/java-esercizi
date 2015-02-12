package campoMinato.view.test;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;

import campoMinato.control.CampoController;
import campoMinato.exceptions.LostException;
import campoMinato.model.Campo;
import campoMinato.model.CampoBuilderConcrete;
import campoMinato.model.Casella;
import campoMinato.view.CampoView;
import campoMinato.view.CasellaView;

/**
 * Candidato ad essere qualcosa di molto simile ad un main
 * 
 * @author claudio
 *
 */
public class CampoViewTest {

	// TODO: Serve un JTest?
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	public static void main(String[] args) {
		// Creo il campo:
		Campo campo = new Campo(new CampoBuilderConcrete());

		campo.getCampoDiCaselle()[1][2].setClicked(true);	// Le caselle 2-3 e 3-2 
		campo.getCampoDiCaselle()[2][1].setClicked(true);	// (qui a fianco) sono le uniche cliccate

		campo.getCampoDiCaselle()[2][1].setFlag(true);	// Non dovrebbe mostrare nulla, la flag si vede solo se la casella non è cliccata
		campo.getCampoDiCaselle()[2][1].setMine(true);	// Dovrebbe mostrare la mina
		campo.getCampoDiCaselle()[2][3].setFlag(true);	// Dovrebbe mostrare la bandiera
		campo.getCampoDiCaselle()[2][3].setMine(true);	// Non dovrebbe mostrare nulla
		campo.getCampoDiCaselle()[2][2].setMine(true);
		campo.getCampoDiCaselle()[0][4].setMine(true);
		
		campo.settaMineAdiacenti();
		

		// Creo il pannello per il campo
		JPanel campoPanel = new CampoView(campo);
		
		// Aggiungo il Listener (controller) alla vista campoPanel:
		CampoController campoController = new CampoController(campo);
		campoPanel.addMouseListener(campoController);
		
		// Istanzio il frame
		JFrame frame = new JFrame("CasellaViewTest");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Aggiungo il pannello del campo al frame
		frame.getContentPane().add(campoPanel);
		
		// frame visibile (e disegno)
		frame.setVisible(true);
	}

}
