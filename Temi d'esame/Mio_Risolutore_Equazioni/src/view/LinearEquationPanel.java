package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LinearEquationPanel extends JPanel {

	private static final long serialVersionUID = 1;
	
	public LinearEquationPanel() {
		super();
		
		setLayout(new GridLayout(3, 2));
		JTextArea areaA = new JTextArea("a ="), areaB = new JTextArea("b =");
		JTextField fieldA = new JTextField(), fieldB = new JTextField();
		add(areaA);
		add(fieldA);
		
		add(areaB);
		add(fieldB);
		
		JButton button = new JButton("Risolvi");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO: Risolvi equazione
				
			}
		});
		
		add(button);
	}

}
