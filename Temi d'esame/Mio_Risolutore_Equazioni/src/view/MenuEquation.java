package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.LinearEquation;
import model.ProxyEquation;
import model.QuadraticEquation;

public class MenuEquation extends JMenu {

	private ProxyEquation proxyEquation;

	public MenuEquation(ProxyEquation equation) {
		super("Equazioni");
		this.proxyEquation = equation;

		JMenuItem linItem = new JMenuItem("Eq. Lin");
		linItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				proxyEquation.setEquation(new LinearEquation());
			}
		});
		
		JMenuItem quadItem = new JMenuItem("Eq. Quad");
		linItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				proxyEquation.setEquation(new QuadraticEquation());
			}
		});

		add(linItem);
		add(quadItem);

	}

}
