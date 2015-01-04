package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.CircleTree;
import drawings.DrawingsPanel;
import drawings.TriangleTree;

/**
 * Lancia una Finestra e ci Disegna
 * qualche Albero a Chioma Circolare
 */
public class Test0005 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		panel.addDrawable(new CircleTree(100, 100,
				20, 6, 40,Color.RED,Color.GREEN));
		
		panel.addDrawable(new TriangleTree(200, 100,
				 6, 20, 20, 40,Color.RED,Color.BLUE));
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}