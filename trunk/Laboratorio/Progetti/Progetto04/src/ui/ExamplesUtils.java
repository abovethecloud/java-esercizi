package ui;

import javax.swing.JFrame;

public class ExamplesUtils {

	public static JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Example");
		return frame;
	}

	
}
