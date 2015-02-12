package campoMinato.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import campoMinato.control.CampoController;
import campoMinato.exceptions.LostException;
import campoMinato.model.Campo;
import campoMinato.model.CampoBuilderConcrete;
import campoMinato.view.CampoView;

public class CampoMinato {

	public static void main(String[] args) {
		// Creo il campo:
		Campo campo = new Campo(new CampoBuilderConcrete());

		// Imposto manualmente le mine
		campo.getCampoDiCaselle()[2][1].setMine(true);
		campo.getCampoDiCaselle()[2][3].setMine(true);
		campo.getCampoDiCaselle()[2][2].setMine(true);
		campo.getCampoDiCaselle()[0][4].setMine(true);

		campo.settaMineAdiacenti();

		// Creo il pannello per il campo
		JPanel campoPanel = new CampoView(campo);

		// Aggiungo il Listener (controller) alla vista campoPanel:
		CampoController campoController = new CampoController(campo);
		campoPanel.addMouseListener(campoController);
		
		// Creo il pannello genrale per pulsante e testo
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
	
			// Creo e aggiiungo il pulsante di Nuova Partita
			JButton button = new JButton("Nuova Partita");
			panel.add(button);
			
			// Creo l'area di testo per le comunicazioni
			JTextArea jTextArea = new JTextArea();
			jTextArea.setEditable(false);
			panel.add(jTextArea);
			

		// Istanzio il frame
		JFrame frame = new JFrame("CasellaViewTest");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1, 2));

		// Aggiungo il pannello del campo al frame
		frame.getContentPane().add(campoPanel);
		frame.getContentPane().add(panel);

		// frame visibile (e disegno)
		frame.setVisible(true);
	}

}
