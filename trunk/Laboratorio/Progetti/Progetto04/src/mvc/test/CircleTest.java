package mvc.test;

import javax.swing.JFrame;

import mvc.control.CircleController;
import mvc.model.Circle;
import mvc.view.CircleView;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle(100, 100, 30);
		CircleView view = new CircleView(circle);
		
		CircleController controller = new CircleController(circle);	// Istanzio un controller
		view.addMouseListener(controller);
		view.addMouseMotionListener(controller);
		
		JFrame frame = new JFrame();
		frame.setTitle("Circle");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(view);
		frame.setVisible(true);
	}
}
