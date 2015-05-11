package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.ProxyOggetto;

public class OutputPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1;

	private JTextArea textArea = new JTextArea();
	private ProxyOggetto oggetto;
	private JButton button = new JButton();;

	public OutputPanel(ProxyOggetto oggetto) {
		super();
		this.oggetto = oggetto;
		oggetto.addObserver(this);

		this.setLayout(new GridLayout(1, 2));
		this.add(textArea);
		this.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()
						+ textArea.getText().length());

			}
		});
	}

	@Override
	public void update(Observable o, Object arg) {
		textArea.setText(oggetto.getContenuto());
	}

}
