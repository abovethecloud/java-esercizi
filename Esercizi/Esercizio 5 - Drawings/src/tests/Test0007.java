package tests;

import javax.swing.JFrame;

import drawings.CurveDrawable;
import drawings.DrawingsPanel;
import drawings.DropModel;
import drawings.FlowerModel;
import drawings.SpiralModel;

/**
 * Lancia una Finestra e ci Disegna
 * un Fiore, una goccia ed una Spirale
 */
public class Test0007 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		panel.addDrawable(
				new CurveDrawable(
				new FlowerModel(100, 100, 6, 60)));
		
		panel.addDrawable(
				new CurveDrawable(
				new SpiralModel(200, 100, 6, 60)));
		
		panel.addDrawable(
				new CurveDrawable(
				new DropModel(100, 300, 60, 60)));
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}