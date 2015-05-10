package view;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Oggetto;

public class InputPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 0;
	
	private Oggetto oggetto;
	private JTextField textField;
	
	public class KeyAdapterPanel implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			oggetto.setStringa(textField.getText());
		}

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {			
		}
		
	}
	
	public InputPanel(Oggetto oggettoDefault) {
		super();
		textField = new JTextField();
		this.oggetto = oggettoDefault;
		this.oggetto.addObserver(this);
		this.setLayout(new GridLayout(1,1));
		this.add(textField);
		
		textField.addKeyListener(new KeyAdapterPanel());
		
	}

	@Override
	public void update(Observable o, Object arg) {
		System.err.println(oggetto.getStringa());
		
	}

}
