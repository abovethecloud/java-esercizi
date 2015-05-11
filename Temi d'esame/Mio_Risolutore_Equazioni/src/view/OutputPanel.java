package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ProxyEquation;

public class OutputPanel extends JPanel implements Observer{

	private static final long serialVersionUID = 2;
	
	private ProxyEquation equation;
	private String stringEquation;

	private JTextField textField = new JTextField();
	
	public OutputPanel(ProxyEquation equation) {
		this.equation = equation;
		equation.addObserver(this);
		
		setLayout(new GridLayout(1,1));
		add(textField);
		
		textField.setEditable(false);
	}
	
	public void updateStringEquation() {
		StringBuilder stringBuilder = new StringBuilder("");
		stringBuilder.append(equation.getParameter(1));
		stringBuilder.append("*x + ");
		stringBuilder.append(equation.getParameter(0));
		stringBuilder.append(" = 0");
		stringEquation = stringBuilder.toString();
	}

	@Override
	public void update(Observable o, Object arg) {
		updateStringEquation();
		textField.setText(stringEquation);
		textField.repaint();
//		textField.setVisible(false);
//		textField.setVisible(true);
	}
	

}
