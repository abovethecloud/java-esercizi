package mvcSquare.test;

import javax.swing.JFrame;

import mvcSquare.control.SquareControl;
import mvcSquare.model.Square;
import mvcSquare.view.SquareView;

public class mvcSquareTest {
	
	public static void main(String[] args) {
		Square square = new Square(100, 100, 30);
		
		SquareView squareView = new SquareView(square);
		// square.addObserver(squareView); // Questo metodo viene chiamato in automatico con il costruttore.
		
		SquareControl squareControl = new SquareControl(square);
		squareView.addMouseListener(squareControl);
		squareView.addMouseMotionListener(squareControl);
		
		JFrame frame = new JFrame("SquareMVC");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(squareView);
		
		frame.setVisible(true);
	}

}
