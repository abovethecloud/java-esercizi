package view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ProxyOggetto;

public class InputPanel extends JPanel {

	private static final long serialVersionUID = 0;

	private ProxyOggetto oggetto;
	private JTextField textField;

	public class KeyAdapterPanel implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
			oggetto.setContenuto(textField.getText());
		}
	}

	public InputPanel(ProxyOggetto oggettoDefault) {
		super();
		textField = new JTextField();
		this.oggetto = oggettoDefault;
		this.setLayout(new GridLayout(1, 1));
		this.add(textField);

		textField.addKeyListener(new KeyAdapterPanel());
	}
}
