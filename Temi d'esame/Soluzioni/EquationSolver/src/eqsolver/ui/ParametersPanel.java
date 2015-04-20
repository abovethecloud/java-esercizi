package eqsolver.ui;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import eqsolver.ProxyEquation;

public class ParametersPanel extends JPanel implements Observer{

	private static final long serialVersionUID=0;
	
	private static final int PARAMETERS_NUMBER=5;
	private String[] parametersName={"a","b","c","d","e"};
	private JTextField[] parameters=new JTextField[PARAMETERS_NUMBER];
	private ProxyEquation equation;
	
	public class ParameterListener extends KeyAdapter{
		private int index;

		public ParameterListener(int index) {
			super();
			this.index = index;
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			super.keyReleased(e);
			String value=parameters[index].getText();
			
			try {
				Double doubleValue=new Double(value);
				equation.setParameter(index, doubleValue);
				
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
		}
	}
	
	public ParametersPanel(ProxyEquation equation) {
		this.equation=equation;
		equation.addObserver(this);
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new GridLayout(PARAMETERS_NUMBER,2));
		
		for (int i = 0; i < PARAMETERS_NUMBER; i++) {
			add(new JLabel(parametersName[i]));
			parameters[i]=new JTextField();
			add(parameters[i]);
			parameters[i].addKeyListener(new ParameterListener(i));
		}
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		int number=equation.getParametersNumber();
		for(int i=0;i<number;i++){
			parameters[i].setVisible(true);
		}
		for(int i=number;i<PARAMETERS_NUMBER;i++){
			parameters[i].setVisible(false);
		}
	}
}
