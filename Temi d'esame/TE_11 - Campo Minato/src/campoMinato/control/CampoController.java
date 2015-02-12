package campoMinato.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;

import javax.swing.JOptionPane;

import campoMinato.exceptions.LostException;
import campoMinato.model.AssociaPosizioneACasella;
import campoMinato.model.Campo;
import campoMinato.model.Casella;

/**
 * Il Controller del campo interpreta il click del mouse.
 * @author claudio
 *
 */
public class CampoController extends Observable implements MouseListener{

	private Campo campo;
	private AssociaPosizioneACasella associatore;
	private String messaggio;
	
	public CampoController(Campo campo) {
		this.campo = campo;
		this.associatore = new AssociaPosizioneACasella(campo);
	}

	/**
	 * Il tasto sinistro è il pulsante 1, il destro 3.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		int xMouse = e.getX();
		int yMouse = e.getY();

		Casella casellaCliccata = associatore.cheCasella(xMouse, yMouse);

		if (e.getButton() == 1) {
			casellaCliccata.setClicked(true);

			if (casellaCliccata.isPerso()) {
				JOptionPane.showMessageDialog(null, "PERSO", "OOPS...", JOptionPane.ERROR_MESSAGE);
				campo.reset();
			} else
				/*
				 * Dopo aver premuto su una casella, invoco il metodo di campo
				 * che permette, se si tratta di uno 0, di aprire tutte le
				 * caselle adiacenti (in maniera ricorsiva
				 */
				campo.cliccaCaselleAdiacenti(casellaCliccata);
		}
		if (e.getButton() == 3) {
			casellaCliccata.changeFlag();
		}

	}

	public String getMessaggio() {
		return messaggio;
	}
	@Override
	public void mousePressed(MouseEvent e) {		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
