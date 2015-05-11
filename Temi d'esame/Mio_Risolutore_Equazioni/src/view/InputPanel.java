package view;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.ProxyEquation;

public class InputPanel extends JPanel {

	private static final long serialVersionUID = 1;

	private ProxyEquation equation;
	private JTextArea areaA = new JTextArea("a ="),
			areaB = new JTextArea("b ="), areaC = new JTextArea("c =");
	private JTextField[] fields = new JTextField[3];

	public InputPanel(ProxyEquation equation) {
		super();
		this.equation = equation;

		setLayout(new GridLayout(3, 2));
		
		fields[0] = new JTextField();
		fields[1] = new JTextField();
		fields[2] = new JTextField();

		add(areaA);
		add(fields[0]);
		fields[0].addKeyListener(new InputKeyAdapter(0));

		add(areaB);
		add(fields[1]);
		fields[1].addKeyListener(new InputKeyAdapter(1));
		
		add(areaC);
		add(fields[2]);
		fields[2].addKeyListener(new InputKeyAdapter(2));
	}

	public class InputKeyAdapter extends KeyAdapter {

		private int index;

		public InputKeyAdapter(int index) {
			this.index = index;
		}

		@Override
		public void keyReleased(KeyEvent e) {
			super.keyReleased(e);
			equation.setParameter(index, Double.parseDouble(fields[index].getText()));
		}
	}

}
