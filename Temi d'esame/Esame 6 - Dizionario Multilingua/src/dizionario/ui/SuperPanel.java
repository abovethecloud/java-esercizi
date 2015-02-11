package dizionario.ui;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SuperPanel extends JPanel {
	
	JTextField textField = new JTextField("Inserire parola da cercacca");
	JButton button = new JButton("Ricerca");
	JTextArea textArea = new JTextArea("Output");
	
	public SuperPanel() {
		super();
		
		// in Output non si può scrivere
		textArea.setEditable(false);
		
		setLayout(new GridLayout(3,1));
		add(button);
		add(textArea);
		add(textField);
	}
	

}
